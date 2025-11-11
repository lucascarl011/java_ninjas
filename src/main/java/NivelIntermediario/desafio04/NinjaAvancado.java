package NivelIntermediario.desafio04;


public class NinjaAvancado extends NinjaBasico {

    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {}

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // mostra dados do NinjaBasico
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando Habilidade avançada: " + habilidade + " com especialidade: " + especialidade);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + especialidade;
    }
}
