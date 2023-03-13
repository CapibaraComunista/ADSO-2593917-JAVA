import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();

        int arreglo [] = new int [tamano];

        int y = 1;
        for (int i=0; i <arreglo.length; i++){
            arreglo[i] = y;
            y++;
        }
        System.out.println("ingrese una posicion");
        int posicion = entrada.nextInt();

        int posicionVerdadera; 
        if (posicion < 0){
            posicionVerdadera = posicion+= arreglo.length;
        }else {
            posicionVerdadera = posicion % arreglo.length;
        }
        int valor = arreglo[posicionVerdadera];

        System.out.println("arreglo");
        
        for (int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
            
        }
        System.out.println("");
        System.out.println("la posicion "+posicion+" del vector es: "+valor);


       /*  int valor =0;
        int busqueda =0;
        for (int i=0; i<tamano; i++){
            System.out.println("hikgff");
            if (busqueda == posicion){
                System.out.println("guyfd");
                valor = i;
            }
            busqueda++;
        }
        System.out.println("arreglo: ");
        for (int i=0; i<tamano; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
        System.out.println("movimientos: "+posicion);
        System.out.println("valor encontrado: "+valor); */
    }    
}
