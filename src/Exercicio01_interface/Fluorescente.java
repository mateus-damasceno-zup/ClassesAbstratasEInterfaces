package Exercicio01_interface;

public class Fluorescente extends FabricaLampada implements Lampada{

    @Override
    public void ligar() {
        System.out.println("ligou, cemig agradece");
    }

    @Override
    public void desligar() {
        System.out.println("desligou, cemig ficou brava");

    }
}
