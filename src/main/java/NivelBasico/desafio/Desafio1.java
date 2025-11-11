package NivelBasico.desafio;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeNinja1, nomeNinja2, nomeNinja3;
        int idadeNinja1, idadeNinja2, idadeNinja3;
        String missaoNinja1, missaoNinja2, missaoNinja3;
        int nivelDificuldade1, nivelDificuldade2, nivelDificuldade3;
        boolean statusConslusao1, statusConslusao2, statusConslusao3;

        nomeNinja1 = "Naruto";
        nomeNinja2 = "Sasuke";
        nomeNinja3 = "Kakachi";

        idadeNinja1 = 16;
        idadeNinja2 = 18;
        idadeNinja3 = 14;


        missaoNinja1 = "Defender a aldeia da folha";
        missaoNinja2 = "Libertar o cativos dos inimigos";
        missaoNinja3 = "Proteger o lider da aldeia";

        nivelDificuldade1 = 8;
        nivelDificuldade2 = 6;
        nivelDificuldade3 = 9;

        statusConslusao1 = true;
        statusConslusao2 = false;
        statusConslusao3 = true;

        System.out.println("Nome do ninja 1: " + nomeNinja1 + "\nIdade: " + idadeNinja1 + "\nMissão: " + missaoNinja1 + "\nNivel de dificuldade: " + nivelDificuldade1 + "\nStatus: " + statusConslusao1 + "\n");
        System.out.println("Nome do ninja 2: " + nomeNinja2 +  "\nIdade: " + idadeNinja2 + "\nMissão: " + missaoNinja2 + "\nNivel de dificuldade: " + nivelDificuldade2 + "\nStatus: " + statusConslusao2 + "\n");
        System.out.println("Nome do ninja 3: " + nomeNinja3 + "\nIdade: " + idadeNinja3 + "\nMissão: " + missaoNinja3 + "\nNivel de dificuldade: " + nivelDificuldade3 + "\nStatus: " + statusConslusao3 + "\n");
    }
}
