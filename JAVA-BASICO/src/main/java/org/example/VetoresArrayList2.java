package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class VetoresArrayList2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        int quantidadeDeNotas = 2;

        for (int i = 0; i < quantidadeDeNotas; i++) {
            double nota;
            do {
                System.out.printf("Digite a %dª nota (0 a 10): ", (i + 1));
                nota = ler.nextDouble();

                if (nota <= 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota <= 0 || nota > 10);

            notas.add(nota);
        }

        System.out.println("\n--- Exibindo as notas ---");
        double soma = 0;
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
            soma += nota;
        }

        System.out.println("\nMédia: " + (soma / notas.size()));
        ler.close();
    }
}