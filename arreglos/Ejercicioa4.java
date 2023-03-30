import java.util.Scanner;
public class Ejercicioa4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        int[] logintud = new int[tamano];
        int acomodador = 0;
        for (int i=0;i<logintud.length;i++){
            System.out.println("ingrese el valor numero: "+i);
            logintud[i] = entrada.nextInt();
        }
        for (int i=0;i<logintud.length-1;i++){
            for (int j=0;j<logintud.length-1;j++){
                if (logintud[j]<logintud[j+1]){
                    acomodador = logintud[j];
                    logintud[j] = logintud[j+1];
                    logintud[j+1] = acomodador;
                }
            }
        }
        for (int i=0;i<logintud.length;i++){
            System.out.println("["+logintud[i]+"]");
        }
    }
    
}
