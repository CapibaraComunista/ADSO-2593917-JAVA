import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String oracion;
        System.out.println("ingrese una oracion");
        oracion = entrada.nextLine();
        int vocales =0;
        int tamano = oracion.length();
        for (int i=0; i<tamano; i++){
            oracion.charAt(i);
            if (oracion.charAt(i) == 65 || oracion.charAt(i) == 97){
                vocales++;
            }else if (oracion.charAt(i) == 69 || oracion.charAt(i) == 101){
                vocales++;
            }else if (oracion.charAt(i) == 73 || oracion.charAt(i) == 105){
                vocales++;
            }else if (oracion.charAt(i) == 79 || oracion.charAt(i) == 111){
                vocales++;
            }else if (oracion.charAt(i) == 85 || oracion.charAt(i) == 117){
                vocales++;
            }
        }
        System.out.println("esta es su oracion: "+oracion);
        System.out.println("esta es la cantidad de vocales: "+vocales);
    }
}