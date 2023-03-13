import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamano de los arreglos");
        int tamano = entrada.nextInt();
        int arreglo1 [] = new int [tamano];
        int arreglo2 [] = new int [tamano];
        
        for (int i=0; i<tamano; i++){
            System.out.println("ingrese el valor de la pos: "+(i+1)+" del vector 1");
            arreglo1[i] = entrada.nextInt();
        }
        for (int i=0; i<tamano; i++){
            System.out.println("ingrese el valor de la pos: "+(i+1)+" del vector 2");
            arreglo2[i] = entrada.nextInt();
        }
        System.out.println("arreglo 1");
        for (int i=0; i<tamano; i++){
            System.out.print("["+arreglo1[i]+"]");
        }
        System.out.println("");
        System.out.println("arreglo 2");
        for (int i=0; i<tamano; i++){
            System.out.print("["+arreglo2[i]+"]");
        }
        System.out.println("");
        System.out.println("arreglo 3");
        for (int i=0; i<tamano; i++){
            System.out.print("["+arreglo1[i]+"]");
            System.out.print("["+arreglo2[i]+"]");
        }
    }
}
