/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Despegar;

import Caracteristicas.Caracteristicas;
import Interfaz.Naves;

/**
 *
 * @author USER
 */
public class Despegar3 extends Caracteristicas implements Naves {

    public Despegar3(int Potencia, int Velocidad, int Peso, String Altura, String Empuje) {
        super(Potencia, Velocidad, Peso, Altura, Empuje);
    }
    

    @Override
    public void Acelerar() {
        System.out.println("La nave tripulada acelera hasta llegar a su maxima velocidad de 350.000  k/m");
    }

    @Override
    public void Frenar() {
        System.out.println("La nave tripulada frena hasta aterrizar en su planeta destino");
    }

    @Override
    public void voltear() {
        System.out.println("La nave tripulada se eleva unos segudos y da una vuelta de 90 grados");
    }

    @Override
    public void Disparar() {
        System.out.println("¡Todos a sus puestos!, procedemos a disparar");
    }
    
}
