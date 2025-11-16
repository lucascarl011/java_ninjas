package NivelIntermediario.records;

// Apenas isso tem a mesma função da Claase Ninja, com as mesma funcionalidade
public record NinjaRecords(String nome, String email, int telefone) {

    // Todos os atributos são FINAL por padrão
    // Records não tem SETTER - Não tem como alterar o atributo

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
