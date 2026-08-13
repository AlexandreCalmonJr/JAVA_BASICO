package org.example;

import java.util.Scanner;

public class MainDoWhile {
    static void main() {

        Scanner ler = new Scanner(System.in);

        int avaliacao;
            do {
                System.out.println("Avalie nosso atedimento, de 1 a 5 estrelas");
                avaliacao = ler.nextInt();
            }while(avaliacao<1|| avaliacao>5);

        System.out.println("Obrigado");
    }


}
