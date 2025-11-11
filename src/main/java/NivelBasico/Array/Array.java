package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referência! Sempre referencia um slot da minha memória
        String[] ninja = new String[6]; // new String é a criação de um novo objeto de memória.
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        // Redeclarar o Array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);


        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }
    }
}
