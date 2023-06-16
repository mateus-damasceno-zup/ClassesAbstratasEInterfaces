package Exercicio01_Abstrato;

import java.util.Objects;

public abstract class Itens {

    private String nome;
    private double preco;

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    private int codigoDeBarras;


    public Itens(String nome, double preco, int codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public String mostrarDetalhesDoItem(){

        return " Nome: "+nome+ " preço " + preco + " codigo de barras " + codigoDeBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itens item = (Itens) o;
        return Objects.equals(getCodigoDeBarras(), item.getCodigoDeBarras());
    }
}
