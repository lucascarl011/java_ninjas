package NivelIntermediario.herancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {

    public void boasVindas() {
        System.out.println(nome + " Eu sou um Hatake");
    }

    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public void ninjaDeElite() {
        System.out.println(nome + " Eu sou um Ninja de Elite");
    }

    public void hokageAtivo() {
        System.out.println(nome + " Eu sou um Hokage");
    }
}
