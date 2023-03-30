import java.util.Scanner;
public class Ciclazo5{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

         System.out.println("imgrese un numero chamito");
         int numero = entrada.nextInt();
         int multiplicacion =0;
         for (int i=0;i<=numero;i++){
            int multiplicado = 1;
            
            while (i<numero){
                multiplicacion = multiplicado*i;
                
            } 
            if (multiplicacion<=1){
                System.out.print(i+ " x " +i+ " = " +multiplicacion);
            }
        }
    }
}