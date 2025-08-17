package NivelIntermediario.construtores;

public class HokagesC {

    // Atributos
    String nome;
    int idade;
    boolean vivoOuMorto;

    // No args constructor = Construtor sem argumentos
    public HokagesC() {
        // Construtor sem argumentos
    }

    // All args constructor = Construtor com todos os argumentos
    public HokagesC(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }
}
