package NivelIntermediario.generics.forma_mais_complexa;

import java.util.ArrayList;
import java.util.List;

// Classe Generica "T"
public class BolsaNinja<T> {

    // Inicializar array com o tipo "Generico"
    private List<T> equipamentos;

    // Construtor para iniciar a variavel que guarda nosso array
    public BolsaNinja() {
        this.equipamentos = new ArrayList<>();
    }

    // Metodo para adicionar equipamentos na bolsa "array"
    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    // Metodo para mostrar equipamentos que estão guardados na nossa lista/array
    public void mostrarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }
}
