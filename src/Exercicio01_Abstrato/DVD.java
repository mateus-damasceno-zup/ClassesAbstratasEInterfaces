package Exercicio01_Abstrato;

public class DVD extends Itens{

    double duracao;

    public DVD(String nome, double preco, int codigoDeBarras, double duracao) {
        super(nome, preco,codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return super.mostrarDetalhesDoItem() +" duração: "+ duracao;
    }
}
