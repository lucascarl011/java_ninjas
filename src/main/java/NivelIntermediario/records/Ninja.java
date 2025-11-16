package NivelIntermediario.records;

// Essa classe serve de exemplo para vermos o que seria feito sem o uso de records e como nossa classe fica muito grande e trabalhosa.

import java.util.Objects;

public class Ninja {

    // Atributos imutaveis - Por isso utilizamos "final"
    private final String nome;
    private final String email;
    private final int telefone;

    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Como os atributos são imutaveis, não podemos alterar os valores contidos neles então só usamos o metodo "get" visualizar os valores dos atributos
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    // Ainda irei estudar sobre equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return telefone == ninja.telefone && Objects.equals(nome, ninja.nome) && Objects.equals(email, ninja.email);
    }

    // Ainda irei estudar sobre hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, email, telefone);
    }

    // Ainda irei estudar sobre toString
    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
