package com.nagano.appgames;

public class Game {

    public int id;
    public String nome;
    private int nota;

    public Game() {
    }

    public Game(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Game(int id, String nome, int nota) {
        this.id = id;
        this.nome = nome;
        this.setNota(nota);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " | " + nota;
    }
}
