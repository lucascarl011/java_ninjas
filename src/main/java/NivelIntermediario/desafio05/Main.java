package NivelIntermediario.desafio05;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(2000);

        System.out.println();
        System.out.println("Saldo inicial na Conta Corrente R$: " + cc.consultarSaldo());
        cc.depositar(500);
        System.out.println("Saldo após depósito R$: " + cc.consultarSaldo());

        System.out.println();
        System.out.println("Saldo Inicial na Conta Poupanca R$: " + cp.consultarSaldo());
        cp.depositar(500);
        System.out.println("Saldo após deposito R$: " + cp.consultarSaldo());
    }
}
