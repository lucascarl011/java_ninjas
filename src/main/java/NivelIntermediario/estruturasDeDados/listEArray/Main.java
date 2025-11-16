package NivelIntermediario.estruturasDeDados.listEArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrays são estáticos não aumentam nem diminiuem
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");

        System.out.println("Lista com adições iniciais: " + ninjasList);

        // Para adicionar elementos da lista utilizamos: add
        ninjasList.add("Tobirama Haruno");

        System.out.println("Lista com adição do Tobirama Haruno: " + ninjasList);

        // Para substituir elementos da lista utilizamos: set -
        // (o "3" indicado o elemento a ser substituido e depois da virgula o elemento a ser adicionado "Kakashi")
        ninjasList.set(3, "Kakashi");

        System.out.println("Lista com substituição de ninja: " + ninjasList);

        // Para remover elementos da lista utilizamos: remove
        ninjasList.remove(0);

        System.out.println("Lista com remoção do primeiro Ninja: " + ninjasList);

        // Para visualizar o tamanho da lista utilizamos: size
        System.out.println("A lista tem: " + ninjasList.size() + " elementos");

    }
}
