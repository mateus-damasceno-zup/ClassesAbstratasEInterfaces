package Exercicio01_Abstrato;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Itens> itens =new ArrayList<>();

        itens.add(new CD("palavras do coracao ",22.22,14, 1));
        itens.add(new CD("palavras do coracao ",22.22,16, 15));
        itens.add(new Livro("poemas para brincar ",55.22, 2,"José Paulo Paes"));
        itens.add(new DVD("Como treinar seu Dragão ",122.33,3,120));

        for (Itens produto : itens){
            System.out.println(produto.mostrarDetalhesDoItem());
        }
        Loja.busca(3,itens);
        itens.equals(itens);
    }

    public static void busca(int cod_barras, List<Itens> itens){

        System.out.println("buscando");
       for (Itens item: itens){
           if(item.getCodigoDeBarras() == (cod_barras)){
               System.out.println(item.mostrarDetalhesDoItem());
               return;
           }
       }
        System.out.println("item nao encontrado");

    }
}
