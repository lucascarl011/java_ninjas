package NivelIntermediario.estruturasDeDados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue
        // O primeiro é chamado de HEAD(CABEÇA) e o último é chamado de TRAIL
        // O primeiro a entrar é o primeiro a sair - First in, First out "FIFO"
        // NÃO É POSSIVEL DELETAR O TRAIL - PARA DELETAR O -ULTIMO SERÁ NECESSARIO DELETAR TODOS OS ELEMENTOS QUE ESTÃO A FRENTE
        Queue<String> ninjaQueue = new LinkedList<>();

        // Para adicionar elementos na minha fila = "add"
        ninjaQueue.add("Naruto Uzumaki");
        ninjaQueue.add("Sasuke Uchiha");
        ninjaQueue.add("Sakura Haruno");
        ninjaQueue.add("Kakashi Hatake");
        ninjaQueue.add("Hasirama Senju");

        System.out.println("Fila de Ninja: " + ninjaQueue);

        // Para remover o primeiro elemento da fila = "poll" - é obrigatoriamente forçado a remover o primeiro elemento da fila.
        ninjaQueue.poll();
        System.out.println("Ninjas na fila depois do poll = " + ninjaQueue);

        // Para ver quem é o primeiro da fila = "peek"
        System.out.println("Ninja no HEAD o primeiro da fila = " + ninjaQueue.peek());

        // Verificar se a fila está vazia
        if (ninjaQueue.isEmpty()) {
            System.out.println("Sua fila está vazia");
        }
    }
}
