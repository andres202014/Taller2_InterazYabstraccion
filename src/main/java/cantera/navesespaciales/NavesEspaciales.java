package cantera.navesespaciales;
import Despegar.Despegar;
import Despegar.Despegar2;
import Despegar.Despegar3;
import java.util.Scanner;

/**
 *
 * @author Andres Lopez Restrepo
 */
public class NavesEspaciales {
    Scanner teclado = new Scanner(System.in);
    int opcion,opcion2;
    Despegar d1 = new Despegar(0,0,0,"","");
    Despegar2 d2 = new Despegar2(0,0,0,"","");
    Despegar3 d3 = new Despegar3(0,0,0,"","");
    
 public void NavesEspaciales(){
     
        System.out.println("|---------------------------------------------------|");
        System.out.println("| 1. Crear Nave espacial                            |");
        System.out.println("| 2. Terminar Programa                              |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Digite la opcion deseada: ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            
            case 1: System.out.println("1. Vehiculo Lanzadera");
                    System.out.println("2. Nave no tripulada");
                    System.out.println("3. Nave espacial tripulada");
                    opcion2 = teclado.nextInt();
                switch(opcion2){
                    
                case 1: 
                    System.out.println("| Has elegido crear Nave Lanzadera ");
                    System.out.println("Digite la potencia de su nave de maximo 20.000");
                    d1.Potencia = teclado.nextInt();
                    System.out.println("Digite su Velocidad en K/m");
                    d1.Velocidad = teclado.nextInt();
                    System.out.println("Digite el peso de la nave, que no sea mas de 50 toneladas");
                    d1.Peso = teclado.nextInt();
                    System.out.println("digite que tan alta desea su nave, Alta, normal, o baja");
                    d1.Altura = teclado.next();
                    System.out.println("Digite el empuje de su nave en toneladas");
                    d1.Empuje = teclado.next();
                    System.out.println();
                    System.out.println("A continuacion un breve resumen de su nave:");
                    System.out.println("Su potencia es de: "+ d1.Potencia);
                    System.out.println("Su velocidad crucero sera de: "+d1.Velocidad);
                    System.out.println("Su Peso sera de: "+d1.Peso);
                    System.out.println("Su altura sera: "+d1.Altura);
                    System.out.println("y por ultimo su Empuje es de: "+d1.Empuje);
                    System.out.println();
                    System.out.println("A continuacion su nave procede a despegar");
                    d1.Acelerar();
                    d1.Frenar();
                    d1.voltear();
                    d1.Disparar();
                    NavesEspaciales();
                    
                case 2:
                    System.out.println("| Has elegido crear Nave No tripulada ");
                    System.out.println("Digite la potencia de su nave de maximo 10.000");
                    d2.Potencia = teclado.nextInt();
                     System.out.println();
                    System.out.println("Digite su Velocidad en K/m");
                    d2.Velocidad = teclado.nextInt();
                    System.out.println("Digite el peso de la nave, que no sea mas de 20 toneladas");
                    d2.Peso = teclado.nextInt();
                    System.out.println("digite que tan alta desea su nave, Alta, normal, o baja");
                    d2.Altura = teclado.next();
                    System.out.println("Digite el empuje de su nave en toneladas");
                    d2.Empuje = teclado.next();
                    System.out.println();
                    System.out.println("A continuacion un breve resumen de su nave:");
                    System.out.println("Su potencia es de: "+ d2.Potencia);
                    System.out.println("Su velocidad crucero sera de: "+d2.Velocidad);
                    System.out.println("Su Peso sera de: "+d2.Peso);
                    System.out.println("Su altura sera: "+d2.Altura);
                    System.out.println("y por ultimo su Empuje es de: "+d2.Empuje);
                    System.out.println();
                    System.out.println("A continuacion su nave procede a despegar");
                    d2.Acelerar();
                    d2.Frenar();
                    d2.voltear();
                    d2.Disparar();                    
                    NavesEspaciales();
                    
                case 3: 
                    System.out.println("| Has elegido crear Nave Tripulada ");
                    System.out.println("Digite la potencia de su nave de maximo 30.000");
                    d3.Potencia = teclado.nextInt();
                    System.out.println("Digite su Velocidad en K/m");
                    d3.Velocidad = teclado.nextInt();
                    System.out.println("Digite el peso de la nave, que no sea mas de 70 toneladas");
                    d3.Peso = teclado.nextInt();
                    System.out.println("digite que tan alta desea su nave, Alta, normal, o baja");
                    d3.Altura = teclado.next();
                    System.out.println("Digite el empuje de su nave en toneladas");
                    d3.Empuje = teclado.next();
                    System.out.println();
                    System.out.println("A continuacion un breve resumen de su nave:");
                    System.out.println("Su potencia es de: "+ d3.Potencia);
                    System.out.println("Su velocidad crucero sera de: "+d3.Velocidad);
                    System.out.println("Su Peso sera de: "+d3.Peso);
                    System.out.println("Su altura sera: "+d3.Altura);
                    System.out.println("y por ultimo su Empuje es de: "+d3.Empuje);
                    System.out.println();
                    System.out.println("A continuacion su nave procede a despegar");
                    d3.Acelerar();
                    d3.Frenar();
                    d3.voltear();
                    d3.Disparar();
                    NavesEspaciales();
                    
                }
                
            case 2: System.out.println("| Has elegido Salir, ¡Fin del programa! ");
                    System.exit(0);
            default:System.out.println("| Opcion incorrecta, intentalo de nuevo: ");
                    
        }
 }
 
 
        

    public static void main(String[] args) {
        NavesEspaciales N = new NavesEspaciales();
        N.NavesEspaciales();
                           
    }

    
}
