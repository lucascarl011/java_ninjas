package NivelIntermediario.herançaMultipla;

public class MainHerançaMultipla {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
    }
}
