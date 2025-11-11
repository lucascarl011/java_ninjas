package NivelIntermediario.polimorfismo;

// classe filha
public class UchihaP extends NinjaP{

    @Override // Aqui estamos sobreescrevendo o metodo habilidadeEpecial da classe Ninja e colocando caracteristicas diferentes nele
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo");
    }
}
