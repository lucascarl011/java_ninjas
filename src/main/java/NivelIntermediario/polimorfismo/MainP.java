package NivelIntermediario.polimorfismo;

public class MainP {
    public static void main(String[] args) {

        UzumakiP naruto = new UzumakiP();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        UchihaP sasuke = new UchihaP();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}
