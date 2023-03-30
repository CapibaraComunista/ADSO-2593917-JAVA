import java.util.Scanner;
public class Tarea7{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese un numero no mayor a 6 cifras por favor");
        int cantidad_de_digitos = entrada.nextInt();
        if (cantidad_de_digitos >= 100000 && cantidad_de_digitos <= 999999){
            int digito1 = cantidad_de_digitos%10;
            int digito2 = (cantidad_de_digitos/10)%10;
            int digito3 = (cantidad_de_digitos/100)%10;
            int digito4 = (cantidad_de_digitos/1000)%10;
            int digito5 = (cantidad_de_digitos/10000)%10;
            int digito6 = (cantidad_de_digitos/100000)%10;
            System.out.print("$" +digito6+ digito5+ digito4+ "." +digito3+digito2+digito1);
        }else if (cantidad_de_digitos >= 10000 && cantidad_de_digitos <= 99999){
            int digito1 = cantidad_de_digitos%10;
            int digito2 = (cantidad_de_digitos/10)%10;
            int digito3 = (cantidad_de_digitos/100)%10;
            int digito4 = (cantidad_de_digitos/1000)%10;
            int digito5 = (cantidad_de_digitos/10000)%10;
            System.out.print("$" +digito5+digito4+ "." +digito3+digito2+digito1);
        }else if (cantidad_de_digitos >= 1000 && cantidad_de_digitos <= 9999){
            int digito1 = cantidad_de_digitos%10;
            int digito2 = (cantidad_de_digitos/10)%10;
            int digito3 = (cantidad_de_digitos/100)%10;
            int digito4 = (cantidad_de_digitos/1000)%10;
            System.out.print("$" +digito4+ "." +digito3+digito2+digito1);
        }else if (cantidad_de_digitos >=100 && cantidad_de_digitos <= 999){
            int digito1 = cantidad_de_digitos%10;
            int digito2 = (cantidad_de_digitos/10)%10;
            int digito3 = (cantidad_de_digitos/100)%10;
            System.out.print("$" +digito3+digito2+digito1);
        }else if (cantidad_de_digitos >= 10 && cantidad_de_digitos <= 99){
            int digito1 = cantidad_de_digitos%10;
            int digito2 = (cantidad_de_digitos/10)%10;
            System.out.print("$" +digito2+digito1);
        }else if (cantidad_de_digitos >= 0 && cantidad_de_digitos <= 9){
                System.out.print("$" +cantidad_de_digitos);
        }
    }
}