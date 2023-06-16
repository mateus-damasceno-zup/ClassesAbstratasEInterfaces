package Exercicio01_interface;

public class FabricaLampada implements Lampada{


    @Override
    public void ligar() {
        System.out.println("lampada ligou");
    }

    @Override
    public void desligar() {
        System.out.println("lampada desligou");
    }
}
