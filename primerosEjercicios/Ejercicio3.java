package primerosEjercicios;
import java.util.Scanner;
public class Ejercicio3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese  las cooerdenadas de el plano cartesiano");
        System.out.println("ingrese la coordenada x");
        int coordenada_x =  entrada.nextInt();
        System.out.println("ingrese la coordenada y");
        int coordenada_y = entrada.nextInt();
        if (coordenada_y >=1 && coordenada_x >=1){
            System.out.println("su coordenada es del cuadrante 1");
        } else if(coordenada_x <=-1 && coordenada_y >=1){
            System.out.println("su coordenada es del cuadrante 2");
        } else if(coordenada_y <=-1 && coordenada_x <=-1){
            System.out.println("su coordenada es del cuadrante 3");
        } else if(coordenada_y >=-1 && coordenada_x <=1){
            System.out.println("su coordenada es del cadrante 4");
        }
    }
}