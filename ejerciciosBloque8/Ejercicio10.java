import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {

        //incompleto aparte de que me ayudo gpt no lo entiendo
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        int movimientos [] = new int [tamano];

        //entrada.close();
        for (int i=0; i<movimientos.length; i++){
            System.out.println("llene el arreglo en la posicion: "+(i+1));
            movimientos[i] = entrada.nextInt();
        }

        System.out.println("ingrese la cantidad de movimientos uwu");
        int cambios = entrada.nextInt();
        int elementoFinal;
        for (int i=0;i <cambios; i++){
            elementoFinal = movimientos[tamano-1];
            for (int j=movimientos.length-1; j> 0; j--){
                movimientos[j] = movimientos[j-1];
            }
            movimientos[0] = elementoFinal;
            System.out.println("");

            for (int j= movimientos.length-1; j>0; j--){
                System.out.print("["+movimientos[j]+"]");
            }
        }
        System.out.println("");


    }
}
