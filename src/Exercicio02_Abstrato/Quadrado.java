package Exercicio02_Abstrato;

public class Quadrado extends Retangulo{

    public Quadrado() {
    }

    @Override
    public double calcularPerimetro() {
        return 4*getAltura();
    }

    @Override
    public double calcularArea() {
        return 2*getAltura();
    }
}
