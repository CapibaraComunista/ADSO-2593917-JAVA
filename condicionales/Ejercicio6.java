import java.util.Scanner;
public class Ejercicio6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un mumero de 6 digitos polfa");
        int total_digitos = entrada.nextInt();
        System.out.println("//-------------------------------------------//");
        System.out.println("1. primer digito    2. segundo digito   3. tercer digito");
        System.out.println("4. cuarto digito  5. quinto digito    6. sexto digito");
        System.out.println("//-------------------------------------------//");

        System.out.println("ingrese una opcion: (ejemplo 4)");
        int opcion_de_cifra = entrada.nextInt();

        if (opcion==1){
            resultado=total_digitos%10
            System.out.println("el primer digito es"+resultado);
        }else if (opcion==2){
            resultado=(total_digitos/10)%10
            System.out.println("el segundo digito es"+resultado);
        }else if (opcion==3){
            resultado=(total_digitos/100)%10
            System.out.println("el tercer digito es"+resultado);
        }else if (opcion==4){
            resultado=(total_digitos/1000)%10
            System.out.println("el cuarto digito es"+resultado);
        }else if (opcion==5){
            resultado=(total_digitos/10000)%10
            System.out.println("el quinto digito es"+resultado);
        }else if (opcion==6){
            resultado=(total_digitos/100000);
            System.out.println("el sexto digito es"+resultado);
        }
    }
}