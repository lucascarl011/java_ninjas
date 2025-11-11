package NivelBasico.condicoes;

/*
* Obejtivo da aula: trabalhar com condições através do If e Else.
* E passar o ninja de nivel cde acordo com o numero de missões.
* */

public class IfEElse {
    public static void main(String[] args) {

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numerDeMissoes = 21;

        if (numerDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numerDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }

    }
}
