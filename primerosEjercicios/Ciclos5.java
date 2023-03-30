package primerosEjercicios;
import java.util.Scanner;
public class Ciclos5{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuatas sucecciones fibonnaci le gustaria ver");
        int sucecciones = entrada.nextInt();
        int suma1 = 0;
        int suma2 = 1;
        int fibonnaci = suma1 + suma2;
        for (int i=1;i<sucecciones;i++){
            while(fibonnaci>=0){
                System.out.println("ingrese un numero");
                System.out.println("este es su resultado fibonnaci: "+fibonnaci);
            }
        }
    }
}