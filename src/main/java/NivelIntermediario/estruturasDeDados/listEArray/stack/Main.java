package NivelIntermediario.estruturasDeDados.listEArray.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinamicas e tamanho aumenta e diminuem conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Sasuke Uchiha");

        // Stack
        // O ultimo elemento é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
    }
}
