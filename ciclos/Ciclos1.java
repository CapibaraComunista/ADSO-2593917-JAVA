import java.util.Scanner;
public class Ciclos1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite cuantas notas va a ingresar");
        int n = entrada.nextInt();

        float suma = 0;

        for(int i=1; i<=n; i++){
            System.out.println("ingrese sus notas uwu");
            float nota = entrada.nextFloat();
            suma = suma + nota;
        }
        float promedio = suma / n;
        System.out.println("su promedio es:"+promedio);
    }
}
