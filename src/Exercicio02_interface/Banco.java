package Exercicio02_interface;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Corrente(1,"Mateus","corrente",100,0.10);
        Conta p1 = new Poupanca(2,"Karla","poupanca",1000,0);
        Conta s1 = new SeguroDeVida(3,"Seguro","Seguro",10000,42);
        Conta c2 = new Corrente(4,"Geremias","Corrente",11111,0.10);

        double taxaC1 = c1.tributos();
        double taxaP1 = p1.tributos();
        double taxaS1 = s1.tributos();
        double taxaC2 = c2.tributos();

        System.out.println(c1.toString());
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(c2.toString());


        System.out.println("tributo das contas");

        System.out.println("tipoConta: "+c1.getTipoConta() +" tributos: "+taxaC1+
                "\n tipoConta: "+p1.getTipoConta() +" tributos: "+taxaP1+
                "\n tipoConta: "+s1.getTipoConta() +" tributos: "+taxaS1+
                "\n tipoConta: "+c2.getTipoConta() +" tributos: "+taxaC2
        );


    }
}
