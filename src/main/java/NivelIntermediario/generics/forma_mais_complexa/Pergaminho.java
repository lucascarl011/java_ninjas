package NivelIntermediario.generics.forma_mais_complexa;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
