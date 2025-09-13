package NivelIntermediario.desafio05;

import java.sql.SQLOutput;

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

        System.out.println("\nSaque na na conta Corrente: ");
        cc.sacar(200);

        System.out.println("\n----- Transferência ---------");
        cc.transferir(300, cp);

        System.out.println("\n--- SALDOS FINAIS ---");
        System.out.println("Conta Corrente R$: " + cc.consultarSaldo());
        System.out.println("Conta Poupanca R$: " + cp.consultarSaldo());
    }
}
