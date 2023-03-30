import java.util.Scanner;
public class Ciclazo1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero entre 1 y 6");
        int numero = entrada.nextInt();
        int multiplicacion = 0;
        int construido = 0;
        int producto =0;
        for (int i=0;i<numero; i++){
            int aleatoreo = (int)(Math.random()*10);
            construido = (construido*10) + aleatoreo;
        }
        System.out.println("este es su numero aleatorio: " + construido);
        producto = construido*2;
        System.out.print("este es el numero multiplicado *2 " + producto);
    }
}