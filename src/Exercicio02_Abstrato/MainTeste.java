package Exercicio02_Abstrato;

import Exercicio01_Abstrato.Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTeste {

    public static void main(String[] args) {
        List<Forma> formaList = new ArrayList<>();
        Random random = new Random();

        for( int i=0;i<5;i++){
            int opcao= random.nextInt(3);

            if(opcao==0){
                Quadrado q1 = new Quadrado();
                q1.setNome("quadrado"+i);
                q1.setAltura(random.nextInt(100));
                System.out.println("lado quadrado" +q1.getAltura());
                formaList.add(q1);
            }
            if(opcao==1){
                Retangulo r1 = new Retangulo();
                r1.setNome("retangulo"+i);
                r1.setAltura(random.nextInt(100));
                r1.setBase(random.nextInt(100));
                System.out.println("lados retangulo :"+r1.getAltura()+"; "+r1.getBase());
                formaList.add(r1);
            }
            if(opcao==2){
                Circulo c1 = new Circulo();
                c1.setNome("circulo"+i);
                c1.setRaio(random.nextInt(100));
                System.out.println("raio: "+c1.getRaio());
                formaList.add(c1);
            }
        }

        for (Forma forma : formaList){
            System.out.println("nome: " +forma.getNome()+ " area " + forma.calcularArea());
            System.out.println("nome: " +forma.getNome()+" perimetro "+forma.calcularPerimetro());
        }
    }
}
