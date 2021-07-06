package com.company;

import java.util.TreeSet;

public class Conjunto {
    private String nome;
    private TreeSet<String> produto;

    public Conjunto(){
        this.produto = new TreeSet<>();
    }
    public void addConjunto(String p){
        produto.add(p);
    }
    

}
