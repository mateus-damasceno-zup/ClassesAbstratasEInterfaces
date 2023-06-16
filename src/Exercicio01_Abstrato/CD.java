package Exercicio01_Abstrato;

public class CD extends Itens{

    int nFaixas;

    public CD(String nome, double preco, int nFaixas, int codigoDeBarras) {
        super(nome, preco,codigoDeBarras);
        this.nFaixas = nFaixas;
    }

    @Override
    public String mostrarDetalhesDoItem() {

        return super.mostrarDetalhesDoItem()+ " numero de faixas "+ nFaixas;
    }
}
