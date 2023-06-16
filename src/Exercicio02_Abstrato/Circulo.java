package Exercicio02_Abstrato;

public class Circulo extends Forma{
    public Circulo() {
    }

    private static double pi = Math.PI;

    public double calcularPerimetro() {
        return 2*pi*getRaio();
    }

    public double calcularArea() {
        return pi*Math.pow(getRaio(),2);
    }
}
