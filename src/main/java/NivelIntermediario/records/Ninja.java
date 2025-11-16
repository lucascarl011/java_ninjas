package NivelIntermediario.records;

// Essa classe serve de exemplo para vermos o que seria feito sem o uso de records e como nossa classe fica muito grande e trabalhosa.

public class Ninja {

    private final String nome;
    private final String email;
    private final int telefone;

    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}
