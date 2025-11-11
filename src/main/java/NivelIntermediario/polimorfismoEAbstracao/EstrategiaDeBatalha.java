package NivelIntermediario.polimorfismoEAbstracao;

public interface EstrategiaDeBatalha {

    void estrategiaDeBatalha();

    // metodo comum
    void inteligenciaDeCombate();

    // Sobrecarga de metodo
    void inteligenciaDeCombate(int qi);
}
