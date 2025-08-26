package NivelIntermediario.construtores;

// claasses abstratas não podem ser instanciadas -  não se pode pegar uma classe abstrata e criar um objeto a partir dela
public abstract class HokagesC {

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

    // Metodos abstratos não podem ter corpo
    public void sabedoriaHokage() {}
    public void rasengan() {}
}
