package NivelIntermediario.desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){

        super(saldoInicial);
    }

    @Override
    public void depositar(double valorDeposito) {

        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito realizado na Conta Corrente: R$" + valorDeposito);
        } else {
            System.out.println("Valor inválido para depósito! Tente outro valor.");
        }
    }
}
