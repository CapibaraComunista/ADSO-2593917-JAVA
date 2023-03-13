import java.util.Scanner;
public class Ejercici3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre = entrada.nextLine();

        char[] nombreInverso = nombre.toCharArray();
        int tamano = nombre.length();
        char[] cambiando = new char[tamano];
        
        for (int i=nombreInverso.length-1; i>=0;i--){
            cambiando[i] = nombreInverso[i];
        }

        System.out.println("su nombre normal mi rey: "+nombre);
        System.out.println("tu nuevo nombre causita: ");
        for (int i=nombreInverso.length-1; i>=0; i--){
            System.out.print(cambiando[i]);
        }
        System.out.println(" ");

    }
}
