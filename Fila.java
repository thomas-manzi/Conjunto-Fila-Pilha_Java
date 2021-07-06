package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fila {
    private String pessoa;
    private LinkedList<String> pes;

    public Fila(){
        this.pes = new LinkedList<>();
    }

    public void addPessoa(String p){
        pes.add(p);
    }

    public void rmvPessoa(String p){
        pes.remove(p);
    }

    public void filaAnda(){
        pes.pollFirst();
    }

    public LinkedList<String> getPes() {
        return pes;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "pes=" + getPes() +
                '}';
    }
}
