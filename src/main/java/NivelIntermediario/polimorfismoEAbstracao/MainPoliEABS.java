package NivelIntermediario.polimorfismoEAbstracao;

public class MainPoliEABS {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 19, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();

        // Utilizando a implemnetação dos construtores
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalha();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();
    }
}