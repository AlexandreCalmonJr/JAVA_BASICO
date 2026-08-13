package org.example;

import java.util.Scanner;

public class Atividade120826 {
    static void main() {

        String nome = "Alexandre Calmon";
        double a = 1;
        double b = 1;
        double c = 1;
        double resultado;

        resultado = (a+b+c)/3;

        if(resultado >= 7){
            System.out.println("Aluno " + nome + " foi aprovado por " + resultado);
        }else {
            System.out.println("Aluno " + nome + " foi reprovado por " + resultado);
        }

    }
}
