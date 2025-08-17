package NivelIntermediario.desafio04;

public class NinjaBasico implements Ninja04{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {}

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando Habilidade: " + habilidade);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade;
    }
}
