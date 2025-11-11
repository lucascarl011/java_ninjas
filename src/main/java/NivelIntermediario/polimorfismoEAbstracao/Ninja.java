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

    // Inteligencia de Combate - metodo padrão
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é a minha Inteligencia de combate");
    }

    // Inteligencia de combate - Sobrecarga de metodo
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Meu QI é: " + qi + " e sou um gênio");
        } else if (qi >= 130) {
            System.out.println("Meu QI é: " + qi + " e sou um Ninja Promissor");
        }else {
            System.out.println("meu QI é: " + qi + " e preciso treinar mais minha estratégia de combate");
        }

    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + ", eu sou da: " + aldeia + ", eu tenho: " + idade +
                " anos. " + " Já completei " +  numeroDeMissoesConcluidas + " missões, " + " e sou um " + rank;
    }
}
