package primerosEjercicios;
import java.util.Scanner;

public class Prueba2{
    public static void main (String [] args){

        //creacion de variables de entrada 
        Scanner entrada = new Scanner (System.in);

        //creacion de variable 
        int cantidad_poblacion_colombia=0;
        int cantidad_poblacion_usa = 350000000;

        // instruccion de salida
        System.out.println("la poblacion de Colombia es " + cantidad_poblacion_colombia);
        System.out.println("la publacion de USA es " + cantidad_poblacion_usa); 

        //lectura de datos
        System.out.print("Ingrese la poblacion de Colombia");
        cantidad_poblacion_colombia = entrada.nextInt();

        System.out.println("la nueva poblacion de Colombia es "+ cantidad_poblacion_colombia);

    }
}