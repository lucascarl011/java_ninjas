package NivelIntermediario.construtores;

public class MainC {
    public static void main(String[] args) {

        // AllArgs Constructor = contrutor com todos argumentos
        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 45;
        hashirama.vivoOuMorto = true;
        System.out.println(hashirama.nome);
        hashirama.sabedoriaHokage();

        System.out.println();
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.vivoOuMorto = true;
        System.out.println(naruto.nome);
        naruto.rasengan();


    }
}
