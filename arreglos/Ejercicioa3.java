import java.util.Scanner;
public class Ejercicioa3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero entero para determinar el tamano del arreglo");
        int entero = entrada.nextInt();
        int[] horario = new int[entero];
        for (int i=0;i<horario.length;i++){
            System.out.println("ingresa el valor de la poscicion: "+(i+1));
            horario[i] = entrada.nextInt();
            int temporal=horario[i];
            horario[i] = horario[horario.length-1];
            horario[horario.length-1]=temporal;
            //horario[i] = valor;
        }
        /*for (int i=0;i<horario.length;i++){
            System.out.println("["+horario[i]+"]");
        }
        */
        System.out.println("ingrese el numero corresponidente a la poscicion del arreglo");
        int poscicion = entrada.nextInt();

        for (int i=0;i<horario.length;i++){
            System.out.println("arreglo = "+"["+horario[i]+"]");
        }
        System.out.println("poscicion: "+poscicion);
        for (int i=poscicion;i<horario.length;i--){
            for (int j=i;j<horario.length;j--){
                System.out.print("["+(horario[j])+"],");
            }          
        }
    }
}
//System.out.println("anti horario: "+"["+(horario[i])+"]");