//package ejercicciosBloque7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        System.out.println("ingrese el tamano del arreglo");
        int longitud = entrada.nextInt();

        String texto [] = new String[longitud];
        
        for(int i=0; i<longitud;i++){
            System.out.println("ingrese el nombre: "+(i+1));
            texto[i] = entradaTexto.nextLine();
        }
        System.out.println("impresion ciclo normal: \n");
        for (int i=0; i<longitud; i++){
            System.out.print("["+texto[i]+"] - ");
        }
        System.out.println("\n");
        String aux;
        for (int i=0; i<longitud;i++){
            for (int j=0; j<longitud-1; j++){
                if (texto[j].compareTo(texto[j+1]) > 0){
                    aux = texto[j];
                    texto[j] = texto[j+1];
                    texto[j+1] = aux; 
                }
            }
        }
        System.out.println("impresion ciclo ordenado: \n");
        for (int i=0; i<longitud; i++){
            System.out.print("["+texto[i]+"] - ");
        }
    }
}
