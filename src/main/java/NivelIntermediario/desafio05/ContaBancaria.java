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
             System.out.println("Saque realizado com sucesso: R$ -" + valorSaque);
         }else {
             System.out.println("Saldo insuficiente");
         }
    }

    @Override
    public void transferir(double valorTransferencia, Conta destino){
         if (valorTransferencia > 0 && valorTransferencia <= saldo) {
             this.sacar(valorTransferencia);
             destino.depositar(valorTransferencia);
             System.out.println("Transferência realizada com sucesso: R$ -" + valorTransferencia);
         } else  {
             System.out.println("Saldo insuficiente para tranferência!");
         }
    }

     @Override
     public abstract void depositar(double valorDeposito);
}
