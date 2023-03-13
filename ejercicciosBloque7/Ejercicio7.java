import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int entero;
        System.out.println("ingrese el tamano del arreglo");
        entero = entrada.nextInt();
       int antiHorario [] = new int [entero];

       int agregados;
       for (int i=0; i<entero; i++){
            System.out.println("ingrese el numero: "+(i+1));
            agregados = entrada.nextInt();
            antiHorario[i] = agregados;
        }

    int pos;
    System.out.println("ingrese la posicion que desea observar");
    pos = entrada.nextInt();

    System.out.println("ciclo nprmal");
       for(int i=0; i<entero; i++){
            System.out.print("["+antiHorario[i]+"] - ");
        }
    System.out.println(" ");
    System.out.println("numero de movimientos: "+pos);

    System.out.println("anti horario: ");
       for (int i=pos; i>=0; i--){
            System.out.print("["+antiHorario[i]+"] - ");
        }

       for(int i=entero-1; i>pos; i--){
            System.out.print("["+antiHorario[i]+"] - ");
        }
    }
}