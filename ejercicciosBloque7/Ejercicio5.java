//package ejercicciosBloque7;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arraglo");
        int tamano = entrada.nextInt();

        String nombre[] = new String[tamano];
        String genero[] = new String[tamano];

        for (int i=0; i<tamano; i++) {
            System.out.println("ingrese nombre");
            nombre[i] = entradaTexto.nextLine();
            System.out.println("ingrese el genero");
            genero[i] = entradaTexto.nextLine();
        }

        
        for (int i=0; i<tamano; i++) {
            System.out.print("["+nombre[i]+" -> "+genero[i]+"] \n");
        }
    }
}
