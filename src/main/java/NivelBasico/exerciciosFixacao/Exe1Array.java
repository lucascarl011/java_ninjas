package NivelBasico.exerciciosFixacao;

import java.util.Scanner;

public class Exe1Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println("Soma dos valores: " + soma);
    }
}
