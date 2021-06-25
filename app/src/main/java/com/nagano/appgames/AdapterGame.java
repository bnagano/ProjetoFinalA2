package com.nagano.appgames;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class AdapterGame extends BaseAdapter {

    private List<Game> gameList;
    private Context context;
    private LayoutInflater inflater;

    public AdapterGame(Context context, List<Game> listaGames){
        this.gameList = listaGames;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return gameList.size();
    }

    @Override
    public Object getItem(int i) {
        return gameList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return gameList.get(i).id;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ItemSuporte item;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_lista, null);

            item = new ItemSuporte();
            item.tvNome = convertView.findViewById(R.id.tvListaNome);
            item.tvNota = convertView.findViewById(R.id.tvListaNota);
            item.layout = convertView.findViewById(R.id.llFundoLista);
            convertView.setTag(item);
        }else{
            item = (ItemSuporte) convertView.getTag();
        }

        Game game = gameList.get(i);
        item.tvNome.setText(game.nome);
        item.tvNota.setText(String.valueOf(game.getNota()));

        if (i % 2==0){
            item.layout.setBackgroundColor(Color.rgb(230, 230,230));
        }else{
            item.layout.setBackgroundColor(Color.WHITE);
        }

        return convertView;
    }

    private class ItemSuporte{
        TextView tvNome, tvNota;
        LinearLayout layout;
    }
}
