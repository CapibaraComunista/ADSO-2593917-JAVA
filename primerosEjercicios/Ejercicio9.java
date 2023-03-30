package primerosEjercicios;
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese una fecha por favor");
        int fecha_año = entrada.nextInt();

        if (fecha_año == 17102003){
            System.out.println("dieci siete de octubre del dos mil tres");
        }else if (fecha_año == 25122003){
            System.out.println("veinti cinco de diciembre del dos mil tres");
        }else if (fecha_año == 19121981){
            System.out.println("dieci nueve de diciembre de mil novecientos ochenta y uno");
        }else if (fecha_año == 07021971){
            System.out.println("siete de febrero de mil novecientos setenta y uno");
        }else if (fecha_año == 07072007){
            System.out.println("siete de junio de dos mil siete");
        }
    }
}

        