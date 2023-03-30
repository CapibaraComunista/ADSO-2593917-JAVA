import java.util.Scanner;
public class Ciclos3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nivel de la piramide");
        int nivel = entrada.nextInt();
        
        //ciclos para las filas
        for (int j=1;j<=nivel;j++){
            System.out.print("   ");

            //imprimiendo espacios para centrar las x
            for (int k=1; k<=nivel-j;k++){
                System.out.print(" ");
            }

            //algoritmo para imprimir x
            int almacen = (j*2)-1;
            for (int i=0; i<almacen; i++){
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}