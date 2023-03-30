import java.util.Scanner;
public class ciclon1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("panita ingrese su salario");
        int sueldo = entrada.nextInt();
        System.out.println("ingrese cuanta cantidad de pagos desea tener");
        int pagos = entrada.nextInt();
        System.out.println("---------------------------formas de pago uwu-------------------------------");
        System.out.println(" 1. pagos de igual valor ");
        System.out.println(" 2. primer pago diferente");
        System.out.println(" 3. ultimo pago diferente");
        System.out.println(" 4. primer y ultimo pago diferentes");
        System.out.println("-----------------------ingrese su forma de pago rey-------------------------");
        int forma = entrada.nextInt();
        int cuotas = 0;
        int diferencia = 0;
        int diferencia1 = 0;
        if (forma == 1){
            System.out.println("---------------sus pagos seran------------------");
            for (int i=0;i<pagos;i++){
                cuotas = sueldo/pagos;
                System.out.println("mes 0"+i+ " $ "+cuotas);
            }
        }else if (forma == 2){
            diferencia = sueldo/2;
            cuotas = diferencia/pagos;
            System.out.println("---------------sus pagos seran------------------");
            System.out.println("primer mes $"+diferencia);
            for (int i=0;i<pagos;i++){
                System.out.println("mes 0"+i+" $ "+cuotas);
            }
        }else if (forma == 3){
            diferencia = sueldo/2;
            cuotas = diferencia/pagos;
            System.out.println("---------------sus pagos seran------------------");
            for (int i=0;i<pagos;i++){
                System.out.println("mes 0"+i+" $ "+cuotas);
            }
            System.out.println("ultimo mes $"+diferencia);
        }else if (forma ==4){
            diferencia = sueldo/3;
            diferencia1 = sueldo/3;
            cuotas = diferencia/pagos;
            System.out.println("---------------sus pagos seran------------------");
            System.out.println("primer mes $"+diferencia);
            for (int i=0;i<pagos;i++){
                System.out.println("mes 0"+i+" $ "+cuotas);
            }
            System.out.println("ultimo mes $"+diferencia1);
        }
    }
}