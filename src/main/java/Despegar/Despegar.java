package Despegar;

import Caracteristicas.Caracteristicas;
import Interfaz.Naves;

/**
 *
 * @author USER
 */
public class Despegar extends Caracteristicas implements Naves {

    public Despegar(int Potencia, int Velocidad, int Peso, String Altura, String Empuje) {
        super(Potencia, Velocidad, Peso, Altura, Empuje);
        
    }
    
    
    
    @Override
    public void Acelerar(){
        System.out.println("La nave de lanzadera acelera hasta llegar a su velocidad maxima de 587.000 kilómetros por hora");
    }
    
    @Override
    public void Frenar (){
        System.out.println("La nave procede a frenar hasta llegar a una velocidad crucero de 200 kilometros por hora");
    }

    @Override
    public void voltear() {
        System.out.println("La nave procede a voltear 15 grados");
    }
    
    @Override
    public void Disparar() {
        System.out.println("Armas desplegadas, comenzamos a disparar");
    }
    
}
