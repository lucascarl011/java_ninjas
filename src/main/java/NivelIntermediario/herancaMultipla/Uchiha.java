package NivelIntermediario.herancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface{

    // Esse metodo vem direto da interface!
    public void sharinganAtivado(){
        System.out.println(nome + ": Ativou o Sharingan");
    }
}
