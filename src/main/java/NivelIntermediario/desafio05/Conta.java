package NivelIntermediario.desafio05;

public interface Conta {

    double consultarSaldo();
    void depositar(double valorDeposito);
    void sacar(double valorSaque);
    void transferir(double valorTransferencia, Conta destino);
}
