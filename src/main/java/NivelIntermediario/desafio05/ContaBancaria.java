package NivelIntermediario.desafio05;

public abstract class ContaBancaria implements Conta{

     double saldo;

     public ContaBancaria(double saldoInicial){

         this.saldo = saldoInicial;
     }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

     @Override
     public abstract void depositar(double valorDeposito);




}
