package NivelIntermediario.polimorfismoEAbstracao;

public class MainPoliEABS {
    public static void main(String[] args) {

        System.out.println("------------- Ninja Naruto -------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", " Aldeia da Folha", 17, 15, NivelNinja.JOUNIN);
        System.out.println(naruto);
        naruto.estrategiaDeBatalha();
        naruto.habilidadeEspecial();
        naruto.inteligenciaDeCombate(150);
        naruto.inteligenciaDeCombate();

        System.out.println();
        System.out.println("------------- Ninja Sasuke -------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 19, 20, NivelNinja.GENIN);
        System.out.println(sasuke);
        sasuke.estrategiaDeBatalha();
        sasuke.habilidadeEspecial();
        sasuke.inteligenciaDeCombate(300);
        sasuke.inteligenciaDeCombate();
    }
}