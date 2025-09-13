package NivelIntermediario.desafio05;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor){

         if (valor > 0) {
             double valorComTaxa = valor * 0.99;
             saldo += valorComTaxa;
             System.out.println("Depósito realizado na Conta Poupança (Com taxa de 1%): R$" + valorComTaxa);
         }  else {
             System.out.println("Valor inválido para depositar! Tente outro valor.");
         }
    }
}
