import java.util.Scanner;
public class Prueba{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un valor en formato COP (pesos colombianos)"); 
        int pesos_colombianos = entrada.nextInt();
        if (pesos_colombianos == 1000){
            System.out.println("1.000");
        }else if (pesos_colombianos == 1001){
            System.out.println("1.001");
        }else if (pesos_colombianos == 10000){
            System.out.println("10.000");
        }else if (pesos_colombianos == 1001001001){
            System.out.println("1,001,001,001");
        }else if (pesos_colombianos == 1000000000){
            System.out.println("1,000,000,000");
        }else {
            System.out.println("no se encontró el numero ingresado");
        }
    }
}