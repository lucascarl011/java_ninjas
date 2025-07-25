package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {

    public static void main(String[] args) {

        /**
         * Dados não primitivos - String, Array, Class, enum
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaalta = nome.toUpperCase(); // ToUpperCase coloca tudo em CAPSLOCK
        System.out.println("Esse texto esta em caixa alta: " + nomeEmCaixaalta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println("Esse texto esta em caixa baixa: " + aldeiaEmCaixaBaixa);
        System.out.println("Esse texto esta normal: " + aldeia);
    }
}
