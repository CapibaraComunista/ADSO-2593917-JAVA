package primerosEjercicios;
import java.util.Scanner;
public class Ciclos5_1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int fibonnaci = entrada.nextInt();
        int numero1 = 0;
        int numero2 = 1;
        int suma = 0;
        for (int i=0;i<=fibonnaci;i++){
            if (i == 0){
                System.out.print("0,1");
            }
             suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
            System.out.print(","+suma);
        }
        System.out.println("\neste es su numero: "+fibonnaci);
    }
}