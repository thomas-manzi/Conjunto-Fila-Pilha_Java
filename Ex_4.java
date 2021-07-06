package com.company;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        boolean t= true;
        String pessoa1[] = {"joao","pedro","paulo","maria","carlos","thomas"};
        Conjunto c1 = new Conjunto();
        String pessoa2[] = {"ana","paulo","antonio","isabel","maria","weverton"};
        Conjunto c2 = new Conjunto();

        Scanner leia = new Scanner(System.in);
        while (t){
            System.out.println("1) Inserir produtos no 1º conjunto ,2) Inserir produtos no 2º conjunto,3) Consultar todos produtos dos dois conjuntos (união),4) Consultar apenas produtos em comum nos dois conjuntos (intersecção).,5) Consultar produtos do 1º conjunto que não existem no 2º conjunto (diferença),6) Consultar se o 1º conjunto está contido no 2º conjunto (verificação de subconjunto). 0-Sair");
            int n = 99;
            n = leia.nextInt();
            if (n == 1) {
                for (int i = 0; i <pessoa1.length ; i++) {
                    c1.addConjunto(pessoa1[i]);
                }
            }
            if (n == 2) {
                for (int i = 0; i <pessoa2.length ; i++) {
                    c2.addConjunto(pessoa2[i]);
                }
            }
            if (n == 3) {
                c1.getUniao(c2.getProduto());
                System.out.println(c1.getProduto());
            }
            if (n == 4) {
                c1.getInterseccao(c2.getProduto());
                System.out.println(c1.getProduto());
            }
            if (n == 5) {
                c1.getDiferenca(c2.getProduto());
                System.out.println(c1);
            }
            if (n == 6) {
                System.out.println(c1.getSubconjunto(c2.getProduto()));
            }
            if (n == 0) {
                t=false;
            }

        }
    }
}
