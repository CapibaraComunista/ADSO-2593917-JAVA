import java.util.Scanner;
public class Ejercicioa5{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero para el tamano del arreglo");
        int tamano = entrada.nextInt();
        int arreglo[] = new int [tamano];
        int poscicion[] = new int [tamano];
        for (int i=0;i<arreglo.length;i++){
            System.out.println("ingrese el valor de la poscicion: "+(i+1));
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("ingrese los movimientos que desea realizar");
        int movimientos = entrada.nextInt();

        for (int i=0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]");
        }

        System.out.println("movimientos: "+movimientos);

        for (int j=0;j<movimientos;j--){
            poscicion[j]++;
            for (int i=0;i<poscicion.length;i--){
                System.out.print("["+arreglo[i]+"]");
            }
        }
    }
}
