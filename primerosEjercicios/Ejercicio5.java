package primerosEjercicios;
import java.util.Scanner;
public class Ejercicio5{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero_1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero_2 = entrada.nextInt();
        System.out.println("ingrese el tercer numero");
        int numero_3 = entrada.nextInt();
        if (numero_1 < numero_2 && numero_2 < numero_3){
            System.out.println("los numeros estan ubicados de forma ascendente");
        } else {
            System.out.println("los numeros no estan ubicados de forma ascendente");
        }
    }
}