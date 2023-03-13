import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
       //cracion de la entrada de texto 
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        //pedir al usuario la palabra y la posicion
        System.out.println("ingrese una palabra bro");
        String palabra = entradaTexto.nextLine();
        System.out.println("ingrese la posicion bro");
        int posicion = entrada.nextInt();

        //es buena practica cerrar las entradas? 
        //una vez que use chatgpt vi que uso el .close y hacia eso y me llamo la atencion
        //aparte que ya no me salen subrayados porque ya se esta usando la variable
        entrada.close();
        entradaTexto.close();

        //creando la descomposion de char para poder cambiar valores
        char desorden[] = palabra.toCharArray();

        //imprimiendo el primer for donde empieza desde la posicion hasta la longitud
        for (int i=posicion; i<palabra.length();i++){
            System.out.print(desorden[i]);
        }
        //imprimiendo el segundo for donde empieza desde 0 hasta la posicion y esto nos dara el resultado deseado
        for (int i=0; i<posicion; i++){
            System.out.print(desorden[i]);
        }
        //generando un espacio solo pára que la consola no choque con nuestro resultado XD
        System.out.println("");
    }
}
