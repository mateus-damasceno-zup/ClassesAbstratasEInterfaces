package Exercicio02_interface;

public class SeguroDeVida extends Conta implements Tributo{


    public SeguroDeVida(int conta, String nomeCliente, String tipoConta, double saldo, double taxa) {
        super(conta, nomeCliente, tipoConta, saldo, taxa);
    }

    @Override
    public double tributos() {
        return getTaxa();
    }
}
