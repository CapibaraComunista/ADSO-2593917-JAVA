import java.util.Scanner;
public class Ciclos2{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite cuantas materias quiere calcular");
        int n = entrada.nextInt();
        float notas = 0;
        int creditos = 0;
        for (int i=1; i<=n; i++){
            System.out.println("ingrese cuantas notas va a calcular");
            float nota = entrada.nextFloat();
            System.out.println("ingrese cuantos creditos tiene");
            int total_creditos = entrada.nextInt();
            for (int i=1; i<=nota; i++){
                System.out.println("ingrese las notas");
                float total_notas = entrada.nextInt();
                notas = notas + nota
            }
        }
        total_promedio = ()/;
        System.out.println("este es el promedio en general"+total_promedio);
    }
}