import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //es buena practica declarar una variable y al mismo tiempo pedir su valor al usuario?
        //o es mejor primero declararla y despues en otra linea asignarle el valor con el usuario? 
        System.out.println("ingrese la primera palabra chamo");
        String palabraUno = entrada.nextLine();
        System.out.println("ingrese la segundo chamo");
        String palabraDos = entrada.nextLine();

        char descomposionUno [] = palabraUno.toCharArray();
        char descomposionDos [] = palabraDos.toCharArray();
        //int longitud = palabraUno.length()+palabraDos.length();

        if (palabraUno.length() > palabraDos.length()){
            int nuevaPalabraDos = palabraUno.length();
            char cambioLongitudDos [] = new char [nuevaPalabraDos];
            System.arraycopy(descomposionDos, cambioLongitudDos, descomposionDos.length);
        }else if (palabraDos.length() > palabraUno.length()){
            
        }else{

        }

        for (int i=0; i<palabraUno.length(); i++){
            System.out.print(descomposionUno[i]);
        }
        for (int i=0; i<palabraDos.length();i++){
            System.out.print(descomposionDos[i]);
        }
        System.out.println(" ");

    }
}
