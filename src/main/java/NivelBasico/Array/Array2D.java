package NivelBasico.Array;

public class Array2D {
    public static void main(String[] args) {

        // Array 2D - com linhas e colunas. Nesse exemplo abaixo 3 limhas e 3 colunas.
        String[][] ninjasEAldeias = new String [3][3];

        ninjasEAldeias[0][0] = "Folha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - " + ninjasEAldeias[i][1] + " - " + ninjasEAldeias[i][2]);
        }
    }
}
