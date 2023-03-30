import java.util.Scanner;
public class Ciclazo4{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero no mayor a 6 digitos");
        int entero = entrada.nextInt();
        int original =0;
        int ultimo=0;
        int voltiao=0;
        original = entero;
        while (entero != 0){
            ultimo = entero%10;
            voltiao = (voltiao * 10) + ultimo;
            entero = entero/10;
        }
        if ( entero == original){
            System.out.print("su numero es palindromo");
        }else{
            System.out.print("su numero no es palindromo");
        }
    }
}