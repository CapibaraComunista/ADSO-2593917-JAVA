import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la longitud del arreglo");
        int longitud = entrada.nextInt();
        int arregloUno [] = new int [longitud];
        int arregloDos [] = new int [longitud];
        int comparacionUno [] = new int [longitud];
        int comparacionDos [] = new int [longitud];

        for (int i=0; i<longitud; i++){
            System.out.println("llene la posicion: "+(i+1)+" del arreglo 1");
            arregloUno[i] = entrada.nextInt();
            comparacionUno[i] = arregloUno[i];
        }
        for (int i=0; i<longitud; i++){
            System.out.println("llene la posicion: "+(i+1)+" del arreglo 2");
            arregloDos[i] = entrada.nextInt();
            comparacionDos[i] = arregloDos[i];
        }

        for (int i=0; i<longitud; i++){
            for (int j=0; j<longitud-1; j++){
                if (comparacionUno[j] > comparacionUno[j+1]){
                    int temp = comparacionUno[j];
                    comparacionUno[j] = comparacionUno[j+1];
                    comparacionUno[j+1] = temp;
                }
                if (comparacionDos[j] > comparacionDos[j+1]){
                    int temp2 = comparacionDos[j];
                    comparacionDos[j] = comparacionDos[j+1];
                    comparacionDos[j+1] = temp2;
                }
            }
        }
        System.out.println("");
        System.out.println("arreglo 1: ");
        for (int i=0; i<longitud; i++){
            System.out.print("["+arregloUno[i]+"]");
        }
        System.out.println("");
        System.out.println("arreglo 2: ");
        for (int i=0; i<longitud; i++){
            System.out.print("["+arregloDos[i]+"]");
        }
        boolean parecidos = false;

        for (int i=0; i<longitud; i++){
            if (comparacionUno[i] == comparacionDos[i]){
                parecidos = true;
            }else{
                parecidos = false;
            }
        }

        System.out.println("");
        if (parecidos == true){
            System.out.println("los arreglos son similares");
        }else{
            System.out.println("los arreglos no son similares");
        }
        System.out.println("");

    }
}
