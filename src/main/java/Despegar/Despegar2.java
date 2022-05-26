package Despegar;
import Caracteristicas.Caracteristicas;
import Interfaz.Naves;
/**
 *
 * @author USER
 */
public class Despegar2 extends Caracteristicas implements Naves{

    public Despegar2(int Potencia, int Velocidad, int Peso, String Altura, String Empuje) {
        super(Potencia, Velocidad, Peso, Altura, Empuje);
    }
    

    @Override
    public void Acelerar() {
        System.out.println("La nave no tripulada acelera hasta llegar a su velocidad maxima de 200.000 kilómetros por hora");
    }

    @Override
    public void Frenar() {
        System.out.println("La nave no tripulada frena hasta quedar totalmente estatica en el espacio");
    }

    @Override
    public void voltear() {
        System.out.println("La nave no tripulada voltea a una gran velocidad y queda en su misma posicion");
    }

    @Override
    public void Disparar() {
        System.out.println("Se ha deshabilitado la opcion de armas");
        
    }
    
}
