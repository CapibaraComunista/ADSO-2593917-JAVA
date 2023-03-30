import java.util.Scanner;
public class Ejercicioa1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo papu");
        int tamano = entrada.nextInt();
        int[] impares = new int [tamano];
        for (int i=0;i<tamano;i++){
            impares[i] = (((i+1)*2)-1);
        }
        for (int i=0;i<tamano;i++){
            System.out.println("["+impares[i]+"]");
        }
    }
}