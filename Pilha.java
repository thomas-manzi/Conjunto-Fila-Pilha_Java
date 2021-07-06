package com.company;

import java.util.LinkedList;

public class Pilha {
    private String livro;
    private LinkedList<String> titulo;

    public Pilha(){
        this.titulo = new LinkedList<>();
    }
    public void addLivro(String p){
        titulo.add(p);
    }
    public void rmvLivro(String p){
        titulo.remove(p);
    }

    public void pilhaAnda(){
        titulo.pollLast();
    }

    public LinkedList<String> getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "titulo=" + getTitulo() +
                '}';
    }
}
