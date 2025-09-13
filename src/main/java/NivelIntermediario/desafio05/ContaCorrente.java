package NivelIntermediario.desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){

        super(saldoInicial);
    }

    @Override
    public void depositar(double valor){

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado na Conta Corrente: R$" + valor);
        } else {
            System.out.println("Valor inválido para depósito! Tente outro valor.");
        }
    }
}
