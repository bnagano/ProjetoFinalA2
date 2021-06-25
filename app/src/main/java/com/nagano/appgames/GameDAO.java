package com.nagano.appgames;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class GameDAO {

    public static void inserir(Game game, Context context){
        ContentValues valores = new ContentValues();
        valores.put("nome",game.nome);
        valores.put("nota",game.getNota());

        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getWritableDatabase();

        db.insert("game", null, valores);
    }

    public static void editar(Game game, Context context){
        ContentValues valores = new ContentValues();
        valores.put("nome",game.nome);
        valores.put("nota",game.getNota());

        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getWritableDatabase();

        db.update("game", valores, "id = " + game.id, null);
    }

    public static void excluir(int id, Context context){
        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getWritableDatabase();
        db.delete("game", "id = " + id, null);
    }

    public static List<Game> getGames(Context context){
        List<Game> lista = new ArrayList<>();

        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM game ORDER BY nome", null);

        if (cursor.getCount()>0){

            cursor.moveToFirst();

            do {
                Game game = new Game();
                game.id = cursor.getInt(0);
                game.nome = cursor.getString(1);
                game.setNota(cursor.getInt(2));

                lista.add(game);
            }while(cursor.moveToNext());

        }

        return lista;
    }

    public static Game getGameById(Context context, int id){
        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM game WHERE id = "+ id,null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
                Game game = new Game();
                game.id = cursor.getInt(0);
                game.nome = cursor.getString(1);
                game.setNota(cursor.getInt(2));
                return game;
        }else{
            return null;
        }
    }
}
