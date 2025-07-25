package NivelBasico.LacosRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        //While
        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }

        //FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um clone das sombras " + i);
        }
    }
}
