package com.company;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        boolean t= true;
        String p = "";
        Fila pessoa = new Fila();
        Scanner leia = new Scanner(System.in);
        while (t){
            System.out.println("1) Inserir pessoa, 2) Remover pessoa,3) Imprimir fila 0-Sair");
            int n = 99;
            n = leia.nextInt();
            if (n == 1) {
                p =leia.next();
                pessoa.addPessoa(p);
            }
            if (n == 2) {
                p =leia.next();
                pessoa.rmvPessoa(p);
            }
            if (n == 3) {
                pessoa.filaAnda();
                System.out.println(pessoa.getPes());
            }
            if (n == 0) {
                t=false;
            }

        }
    }
}
