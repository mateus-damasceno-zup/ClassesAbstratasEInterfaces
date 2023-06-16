package Exercicio02_Abstrato;

public class Retangulo extends Forma{
    public Retangulo() {
    }

    @Override
    public double calcularArea() {
        return getAltura()*getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return 2*getAltura()+2*getBase();
    }
}
