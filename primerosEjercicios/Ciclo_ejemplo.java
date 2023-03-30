package primerosEjercicios;
import java.util.Scanner;
public class Ciclo_ejemplo{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int cantidad_de_notas = entrada.nextInt();
        if (cantidad_de_notas == 2){
            System..out.println("ingrese sus notas");
            int nota_1 = entrada.nextInt();
            int nota_2 = entrada.nextInt();
            int (nota_1+nota_2)/cantidad_de_notas
        }else if (cantidad_de_notas == 3){
            System..out.println("ingrese sus notas");
            int nota_1 = entrada.nextInt();
            int nota_2 = entrada.nextInt();
            int nota_3 = entrada.nextInt();
            int (nota_1+nota_2+nota_3)/cantidad_de_notas
        }else if (cantidad:cantidad_de_notas == 4){
               System..out.println("ingrese sus notas");
            int nota_1 = entrada.nextInt();
            int nota_2 = entrada.nextInt();
            int nota_3 = entrada.nextInt();
            int nota_4 = entrada.nextInt();
            int (nota_1+nota_2+nota_3+nota_4)/cantidad_de_notas
        }
    }
}