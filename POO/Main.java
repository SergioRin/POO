import Modelo.Modelo;
import Vista.Vista;
import Controlador.controlador;

public class Main {
    public static void main(String[] args) {

        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        

        controlador controlador = new controlador(modelo, vista);
        

        controlador.iniciar();
    }
}