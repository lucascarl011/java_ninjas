package NivelIntermediario.records;

public class Main {
    public static void main(String[] args) {

        // Sem records
        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("----- Sem Records ------");
        System.out.println("Dados do cadastro: " + cadastro);
        System.out.println("Dados do cadastro: " + cadastro.getNome());

        System.out.println();

        // Com records
        NinjaRecords cadastroRecord = new NinjaRecords("Sasuke", "sasuke@email.com", 77777777);
        System.out.println("----- Com Records ------");
        System.out.println("Dados do cadastro com Records: " + cadastroRecord);
        System.out.println("Dados do cadastro com Records: " + cadastroRecord.nome());
        System.out.println("Dados do cadastro com Records: " + cadastroRecord.emailCaixaAlta());
    }
}
