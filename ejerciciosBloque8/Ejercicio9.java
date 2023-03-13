import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("senor usuario ingrese el tamano");
        int tamano = entrada.nextInt();

        int arregloOriginal [] = new int [tamano];
        int arregloPrimos [] = new int [tamano];
        int arregloNoPrimos [] = new int [tamano];
        int primos = 0;
        int noPrimos = 0;
        int validacion = 0;

        

        System.out.println("arreglo original: ");
        for (int i=0; i<tamano; i++){
            arregloOriginal[i] = i;
            System.out.print("["+arregloOriginal[i]+"]");
            for (int j=1; j<=i; j++){
                if (i%j ==0){
                    validacion++;
                }
            }
            if (validacion ==2){
                arregloPrimos[i] = i;
                primos++;
            }else{
                arregloNoPrimos[i] =i;
                noPrimos++;
                validacion = 0;
            }
        }
        System.out.println("");
        System.out.println("arreglo primo y su longitud: "+primos);
        for(int i=0; i<tamano; i++){
            if (arregloPrimos[i] > 0){
                System.out.print("["+arregloPrimos[i]+"]");
            }
        }
        System.out.println("");
        System.out.println("arreglo no primo y su longitud: "+noPrimos);
        for (int i=0; i<tamano; i++){
            if (arregloNoPrimos[i] > 0){
                System.out.print("["+arregloNoPrimos[i]+"]");
            }
        }
        System.out.println("");
    }
}
