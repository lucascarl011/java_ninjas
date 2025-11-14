package NivelIntermediario.generics.forma_mais_complexa;

public class Main {
    public static void main(String[] args) {
        /*
         * O que são generics?
         *
         * 1 - Deixar código escalável
         * 2 - Facilitar manutenção
         * 3 - Código reutilizável e genérico
         * */

        // PAssamos como parametro da Lista a SuperClasse "Object" pois ela nos permite trabalhar com diversos tipos de variaveis
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarEquipamento(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarEquipamento(new Kunai("Kunai de Fogo"));
        bolsaNinja.adicionarEquipamento(new Pergaminho("Frases para Eternidade"));
        bolsaNinja.adicionarEquipamento(new Shuriken(3));

        System.out.println("Itens da Bolsa Ninja: ");
        bolsaNinja.mostrarEquipamentos();
    }
}
