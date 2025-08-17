package NivelIntermediario.polimorfismo;

//Classe mãe
public class NinjaP {

    String nome;
    String aldeia;
    int idade;

    // Metodos geral! Todos os ninjas vão ter - Isso é pilomorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e essa é minha habilidade especial");
    }
}
