package Exercicio01_interface;

public class FabricaLampada {

    public Object construir(String tipoLampada){
        if(tipoLampada.equalsIgnoreCase("Fluorescente")) {
            return new Fluorescente();
        }
        else if (tipoLampada.equalsIgnoreCase("Incandescente")){
            return new Incandescente();
        }else{
            return null;
        }
    }


}
