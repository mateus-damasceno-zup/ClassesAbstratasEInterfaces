package Exercicio01_interface;

public class Incandescente extends FabricaLampada implements Lampada{


    @Override
    public void ligar() {
        System.out.println("ligou");
    }

    @Override
    public void desligar() {
        System.out.println("desligou");

    }
}
