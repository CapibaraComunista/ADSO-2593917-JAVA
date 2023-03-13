import java.util.Scanner;
public class PruebaEJercicio3 {
    public static void main(String[] args) {
        
        //profe, en este problema use chatgpt porque no supé que mas hacer
        // y la verdad quede mas confundido que al principio
        // me gustaria que me pueda explicar este algoritmo y asi yo resolver el propio
        // que estaba creando, que es el Ejercicio3 
        // que igual forma lo adjuntare junto a estos 
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la palabra 1");
        String palabra1 = entrada.nextLine();
        System.out.println("ingrese la palabra 2");
        String palabra2 = entrada.nextLine();

        String palabraCompuesta  = "";

        if (palabra1.length() > palabra2.length()){
            String tem = palabra1;
            palabra1 = palabra2;
            palabra2 = tem;
        }

        for (int i=0; i<palabra2.length(); i++){
            palabraCompuesta += palabra2.charAt(i);
            if( i<palabra1.length()){
                palabraCompuesta += palabra1.charAt(i);
            }else{
                palabraCompuesta += palabra1.charAt(i % palabra1.length());
            }
        }
        System.out.println("palabra 1: "+palabra1);
        System.out.println("palabra 2: "+palabra2);
        System.out.println("nueva palabra: "+palabraCompuesta);
    }
}
