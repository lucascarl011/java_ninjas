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
    public void sacar(double valorSaque){
         if (valorSaque > 0 && valorSaque <= saldo) {
             saldo -= valorSaque;
             System.out.println("Saque realizado com sucesso: -" + valorSaque);
         }else {
             System.out.println("Saldo insuficiente");
         }
    }

     @Override
     public abstract void depositar(double valorDeposito);




}
