import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        //cracion de la entrada de texto
        Scanner entrada = new Scanner(System.in);
        //cracion y pedir datos de para verificar la contrasena 
        System.out.println("ingrese una contrasena pibe");
        System.out.println("debe incluir si o si alguno de los sgtes caracteres .-.");
        System.out.println("!,comilla/s,#,$,%,&,',(,),*,+, ¡,! ,.,-,/" );
        String password = entrada.nextLine();
        //creo un char de inspeccion para poder validar letra por letra
        char inspeccion [] = password.toCharArray();
        //profe no se si esto es una buena practica (crear un solo dato primitivo y separarlo por comas, en vez. De crear varios) igualmente le preguntare de nuevo en clase
        boolean mayusculas = false, minusculas = false, numeros = false, caracteres = false, espacios = false;
        //condicion para saber si tiene mas de 8 caracteres
        if (password.length() >= 8){
            for (int i=0; i<password.length(); i++){
                //validar si hay mayusculas
                if(Character.isUpperCase(inspeccion[i])){
                    mayusculas = true;
                }
                //validar si hay minusculas 
                if (Character.isLowerCase(inspeccion[i])){
                    minusculas = true;
                }
                //validar si hay numeros
                if (inspeccion[i] >=48 && inspeccion[i] <= 57){
                    numeros = true;
                }
                if (inspeccion[i] >=33 && inspeccion[i] <=47){
                    caracteres = true;
                }
                if (inspeccion[i] == 32){
                    espacios = true;
                }

            }
        //si no hay mas de 8 letras me lo papeo
        }else{
            System.out.println("debe ser mayor o igual a 8 rey");
        }
        if (mayusculas == true && minusculas == true && numeros == true && caracteres == true && espacios == false){
            System.out.println("su contrasena: "+password+" es valida jijija");
        }else{
            System.out.println("tu contrasena no es valida");
        }
    }
}