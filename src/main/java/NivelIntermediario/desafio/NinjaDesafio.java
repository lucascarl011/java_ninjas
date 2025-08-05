package NivelIntermediario.desafio;

public class NinjaDesafio {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade + " = anos");
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status Da Missao = " + statusDaMissao);
    }
}
