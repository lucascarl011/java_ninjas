package NivelIntermediario.polimorfismoEAbstracao;

public  abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    // Metodo exixstemte: primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de motodos você não precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo Geral! Todos os Ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodod da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de batalha");
    }
}
