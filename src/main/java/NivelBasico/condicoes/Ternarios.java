package NivelBasico.condicoes;

public class Ternarios {
    public static void main(String[] args) {

    short numeroDeMissoes = 11;
    String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja não completou 10 missões";
        System.out.println(nivelDoNinja);

    }
}
