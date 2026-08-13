package org.example;

public class AtividadeAritme {
    static void main() {
        String nome = "Alexandre Calmon";
        double a = 1;
        double b = 1;
        double c = 1;
        String resultado;


        if((a+b+c)/3 >= 7){
            resultado = "Aprovado";
        } else if ((a+b+c)/3 >= 5) {
            resultado = "Verificação Suplementar";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("Aluno " + nome + " foi " + resultado);


    }
}
