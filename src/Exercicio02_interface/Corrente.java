package Exercicio02_interface;

public class Corrente extends Conta implements Tributo{


    public Corrente(int conta, String nomeCliente, String tipoConta, double saldo, double taxa) {
        super(conta, nomeCliente, tipoConta, saldo, taxa);
    }


}
