package Exercicio01_interface;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qual lampada voce quer construir?" +
                "\n digite 1 para incandescente" +
                "\n digite 2 para fluorescente");
        int opcao = sc.nextInt();


        FabricaLampada fabricaLampada = new FabricaLampada();
        Lampada lampada = null;
        System.out.println(opcao);
            if (opcao == 1) {
                lampada = (Lampada) fabricaLampada.construir("Fluorescente");
            } else if (opcao == 2) {
                lampada = (Lampada) fabricaLampada.construir("Incandescente");
            }

        if (lampada!=null){
            System.out.println("===");
            lampada.ligar();
            lampada.desligar();
        }

    }
}
