import java.util.Scanner;
public class EjercicioPrueba{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud ;
        System.out.println("ingrese el tamano del arreglo");
        longitud = entrada.nextInt();
        int primos [] = new int[longitud];
        int conPrimos =0;

        for(int i=0; i<longitud; i++){
            for(int j=1; j<=i; j++){
                if(i%j ==0){
                    conPrimos++;
                }
            }
            if (conPrimos == 2){
                primos[i] = i;
            }else{
                conPrimos = 0;
            }
        }
        for (int i=0; i<longitud; i++){
            if(primos[i] > 0){
            System.out.println("["+primos[i]+"]");
            }
        }
    }
}