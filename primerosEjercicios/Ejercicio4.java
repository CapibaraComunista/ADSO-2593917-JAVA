package primerosEjercicios;
import java.util.Scanner;
public class Ejercicio4{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int primer_numero = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int segundo_numero = entrada.nextInt();
        System.out.println("ingrese el tercer numero");
        int tercer_numero = entrada.nextInt();

        if (primer_numero > segundo_numero && primer_numero > tercer_numero){
            System.out.println("el numero "+primer_numero+" es el mayor");
        } else if(segundo_numero > primer_numero && segundo_numero > tercer_numero){
            System.out.println("el numero"+segundo_numero+"es el mayor");
        } else if(tercer_numero > primer_numero && tercer_numero > segundo_numero){
            System.out.println("el numero"+tercer_numero+"es el mayor");
        }

        if (primer_numero < segundo_numero && primer_numero < tercer_numero){
            System.out.println("el numero"+primer_numero+"es el menor");
        } else if(segundo_numero < primer_numero && segundo_numero < tercer_numero){
            System.out.println("el numero"+segundo_numero+"es el menor");
        } else if(tercer_numero < primer_numero && tercer_numero < segundo_numero){
            System.out.println("el numero"+tercer_numero+"es el menor");
        }

    }
}

