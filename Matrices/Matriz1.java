import java.util.Scanner;
public class Matriz1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de columnas de su matriz");
        int c = entrada.nextInt();
        System.out.println("ingrese la cantida de filas de su matriz");
        int f = entrada.nextInt();
        int matriz [][] = new int [c][f];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                //System.out.println("ingrese el valor de la columna: "+i+" de la poscicion: "+j);
                matriz [i][j] = (int)(Math.random()*34);
            }
        }
        for (int i = 0; i < c; i++) {
            //System.out.println("");
            for (int j = 0; j < f; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}