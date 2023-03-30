package primerosEjercicios;
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero no mayor a 6 digitos");
        int 6_digitos = entrada.nextInt();

        if (6_digitos == 100000){
            System.out.println("cien mil");
        }else if (6_digitos == 110000){
            System.out.println("ciento diez mil");
        }else if (6_digitos == 111000){
            System.out.println("ciento once mil");
        }
    }
}