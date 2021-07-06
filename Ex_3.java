package com.company;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        boolean t= true;
        String p = "";
        Pilha titulo = new Pilha();
        Scanner leia = new Scanner(System.in);
        while (t){
            System.out.println("1) Inserir livro,2) Remover livro,3) Imprimir pilha 0-Sair");
            int n = 99;
            n = leia.nextInt();
            if (n == 1) {
                p =leia.next();
                titulo.addLivro(p);
            }
            if (n == 2) {
                p =leia.next();
                titulo.rmvLivro(p);
            }
            if (n == 3) {
                titulo.pilhaAnda();
                System.out.println(titulo.getTitulo());
            }
            if (n == 0) {
                t=false;
            }

        }
    }
}
