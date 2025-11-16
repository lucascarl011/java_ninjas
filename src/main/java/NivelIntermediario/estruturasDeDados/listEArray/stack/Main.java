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
        Stack<String> ninjasStack = new Stack<>(); // Criação da minha pilha com o tipo "String"

        // Para adicionar elementos na minha pilha = "push"
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Kakashi Hatake");
        ninjasStack.push("Hinata Hyuga");
        System.out.println("Minha Stack Atual = " + ninjasStack);

        // Para Remover o último elemento da minha pilha = "pop"
        ninjasStack.pop();
        System.out.println("Minha Stack Atualizada com pop = " + ninjasStack);

        // Para visualizar o próximo elemento a sair da minha pilha = "peek"
        System.out.println("Minha Stack com o proximo elemento do topo com peek = " + ninjasStack.peek());

        // Para visualizar o tamanho da minha pilha = "size"
        System.out.println("Tamanho da minha Stack com size = " + ninjasStack.size() + " elementos");
    }
}
