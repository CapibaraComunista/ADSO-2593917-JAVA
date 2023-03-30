import java.util.Scanner;
public class Ejercicioa2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo pa");
        int tamano = entrada.nextInt();
        int[] pares = new int [tamano];
        int[] guardadopar = new int [tamano];
        int[] guardadoinpar = new int [tamano];
        for (int i=0;i<pares.length;i++){
            pares[i] = (int)(Math.random()*100); 
        }
        for (int i=0;i<pares.length;i++){
            int nuevo = 0;
            if (pares[i]%(i+1) ==0){
                nuevo++;
            }
            if (nuevo ==2){
                guardadopar[i] = pares[i];
            }else if (nuevo <= 3 ){
                guardadoinpar[i] = pares[i];
            }
        }
        for (int i=0;i<pares.length;i++){
            System.out.println("["+guardadopar[i]+"]");
        }
    }
}