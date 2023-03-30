import java.util.Scanner;
public class Matriz3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño de las filas");
        int n_fil = entrada.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        int n_col = entrada.nextInt();
        System.out.println("ingrese la cantidad de bombas que desea observar");
        int bombas = entrada.nextInt();
        int matriz [][] = new int [n_fil] [n_col];
        //llenando la matriz
        for (int i = 0; i < matriz.length; i++) {
            //System.out.println("se encuentra en la columna: "+(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[n_fil][n_col] =(int)(Math.random()*0);
                
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("["+matriz[n_col]+"]"+"["+matriz[n_fil]+"]");
            }
        }
    }
}
