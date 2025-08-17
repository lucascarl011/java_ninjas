package NivelIntermediario.desafio04;

public class MainDesafio04 {
    public static void main(String[] args) {

        NinjaBasico nb = new NinjaBasico("Naruto Uzumaki", 18, "Controlar o Ar");
        NinjaAvancado na = new NinjaAvancado("Sasuke Uchiha", 20, "Controle do fogo", "Aniquilação com fogo");

        System.out.println();
        System.out.println("Ninja Básico: " + nb);

        System.out.println("------------------------");
        System.out.println("Ninja Avancado: " + na);
        na.executarHabilidade();



    }
}
