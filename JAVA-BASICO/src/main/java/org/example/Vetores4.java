package org.example;

import java.util.Scanner;

public class Vetores4 {

    static void main() {
        Scanner ler = new Scanner(System.in);
        double[]notas = new double[10];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "ª nota (deve ser maior que 0):");
                notas[i] = ler.nextDouble();

                if (notas[i] <= 0 || notas[i] >=10) {
                    System.out.println("Nota inválida! A nota precisa ser maior que zero.");
                }

            } while (notas[i] <= 0 || notas[i] >=10);
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
