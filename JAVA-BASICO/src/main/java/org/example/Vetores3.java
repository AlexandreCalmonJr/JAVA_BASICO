package org.example;

import java.util.Scanner;

public class Vetores3 {
    static void main() {
        Scanner ler = new Scanner(System.in);
        double[]notas = new double[2];
        double soma = 0;


        for (int i=0;i<2;i++){
            System.out.println("Digite a" + (i + 1) + "ªnota:");
            notas[i] = ler.nextDouble();
        }

        System.out.println("\nExibindo as notas");
        for (double nota : notas){
            System.out.println("Nota: " +nota);
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Exibido Media entre:   "+ media );


        ler.close();

    }


}
