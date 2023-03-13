import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("senor usuario ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        int pares = 0;
        int impares =0;
        int arregloOriginal [] = new int [tamano];
        int arregloPares [] = new int [tamano];
        int arregloImpares [] = new int [tamano];

        
        System.out.println("arreglo original:");
        for (int i=0; i<arregloOriginal.length; i++){
            arregloOriginal[i] =i;
            System.out.print("["+arregloOriginal[i]+"]");
        }
        System.out.println("");

        for (int i=1; i<arregloOriginal.length; i++){
            if(arregloOriginal[i]%2 ==0){
                pares++;
                arregloPares[i] =i;
            }else{
                impares++;
                arregloImpares[i] =i;
            }
        }

        System.out.println("arreglo par:");
        for(int i=0; i<arregloOriginal.length; i++){
            if(arregloPares[i] > 0){
                System.out.print("["+arregloPares[i]+"]");
            }
        }
        System.out.println("longitud: "+pares);
        System.out.println("");

        System.out.println("arreglo impar: ");
        for(int i=0; i<arregloOriginal.length; i++){
            if (arregloImpares[i] > 0){
                System.out.print("["+arregloImpares[i]+"]");
            }
        }
        System.out.println("longitud: "+impares);
        System.out.println("");
        
    }
}
