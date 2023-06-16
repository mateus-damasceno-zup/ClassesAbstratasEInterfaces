package Exercicio02_interface;

public abstract class Conta implements Tributo{

    private String tipoConta;
    private int conta;
    private String nomeCliente;
    private double saldo;

    private double taxa;


    public Conta(int conta, String nomeCliente,String tipoConta, double saldo, double taxa) {
        this.conta = conta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public double tributos() {
        return getSaldo()* taxa;
    }
}
