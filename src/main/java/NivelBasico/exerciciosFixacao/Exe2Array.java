package NivelBasico.exerciciosFixacao;

import java.util.Scanner;

public class Exe2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) +  "º numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            }

        }
        System.out.println("A quantidade de números pares é: " + pares);
    }
}
