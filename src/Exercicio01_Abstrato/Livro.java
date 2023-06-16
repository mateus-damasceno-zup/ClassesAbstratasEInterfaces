package Exercicio01_Abstrato;

public class Livro extends Itens{

    String autor;

    public Livro(String nome, double preco, int codigoDeBarras, String autor) {
        super(nome, preco,codigoDeBarras);
        this.autor = autor;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return super.mostrarDetalhesDoItem()+" autor: "+ autor;
    }
}
