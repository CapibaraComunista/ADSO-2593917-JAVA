import java.util.Scanner;
public class Ejercicio2{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("señor usuario ingrese un numero por favor");
        int numero_1 = entrada.nextInt();
        if (numero_1 % 2 == 0){
            System.out.println("el numero "+numero_1+" es par");
        } else { 
            System.out.println("este numero "+numero_1+" es impar");
        }
        
    }
}