package NivelIntermediario.generics.forma_simples;

/*
* O que são generics?
*
* 1 - Deixar código escalável
* 2 - Facilitar manutenção
* 3 - Código reutilizável e genérico
*
* */

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja adagaDeFogo = new EquipamentosNinja("Adaga De Fogo");
        EquipamentosNinja adagaDeAgua = new EquipamentosNinja("Adaga de Agua");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(adagaDeAgua);
        bolsaGenerica.adicionarEquipamentos(adagaDeFogo);

        System.out.println(bolsaGenerica);
    }
}
