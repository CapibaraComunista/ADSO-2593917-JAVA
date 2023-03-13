import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String oracion ;
        System.out.println("ingrese una oracion");
        oracion = entrada.nextLine();
        int tamano = oracion.length();
        char palabraCambiada[] = new char[tamano];
        char palabraMinuscula[] = new char[tamano];
        char palabraMayuscula[] = new char[tamano];
        
        for (int i=0; i<tamano; i++){
            oracion.charAt(i);
            palabraCambiada[i] = oracion.charAt(i);
        }

        for (int i=0; i<tamano; i++){
            
            if(oracion.charAt(i) >= 65 && oracion.charAt(i) <= 90){
                palabraMinuscula[i] += 32;
                //if (palabraCambiada[i] == 164){
                    //palabraMinuscula[i] = 165;
                //}
            }

            if (oracion.charAt(i) >= 97 && oracion.charAt(i) <= 122){
                palabraMayuscula[i] -= 32; 

            }
                //if (palabraCambiada[i] == 165){
                    //palabraMayuscula[i] = 164;
                //}
            //}//else{
               // System.out.print("no se encontro su texto ingresao");
            //}
        }
        for (int i=0; i<tamano;i++){
            System.out.print(palabraMinuscula[i]);
        }
        for (int i=0; i<tamano; i++){
            System.out.print(palabraMayuscula[i]);
        }
    }
}
