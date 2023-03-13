import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese el tamano del arreglo");
        numero = entrada.nextInt();
        int impares [] = new int [numero];
        for (int i=1; i<numero; i++){
            if(i%2 == 1){
                impares[i] = i;
            }
        }
        for (int i=0; i<numero; i++){
            if(impares[i] > 0){
            System.out.println("["+impares[i]+"]");
            }
        }
    }
}