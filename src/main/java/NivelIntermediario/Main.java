package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar Ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";

        // Criar Ninja Naruto Uzumaki - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";

        // Criar Ninja Sakura....
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura";
        Sakura.idade = 15;
        Sakura.aldeia = "Aldeia da Folha";

        System.out.println("Ninja: " + Sasuke.nome);
        System.out.println("Ninja: " + Naruto.nome);
        System.out.println("Ninja: " + Sakura.nome);


    }
}
