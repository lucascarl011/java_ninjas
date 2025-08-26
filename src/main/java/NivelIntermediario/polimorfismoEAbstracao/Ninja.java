package NivelIntermediario.polimorfismoEAbstracao;

public  abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

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
