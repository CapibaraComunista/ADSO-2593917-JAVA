import java.util.Scanner;
public class EjercicioDosPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su texto panita");
        String oracion = entrada.nextLine();

        char [] nuevaOracion = oracion.toCharArray();

        for (int i=0; i<nuevaOracion.length; i++){
            char palabra = nuevaOracion[i];
            if (Character.isUpperCase(palabra)){
                nuevaOracion[i] = Character.toLowerCase(palabra);
            }else if (Character.isLowerCase(palabra)){
                nuevaOracion[i] = Character.toUpperCase(palabra);
            }
        }
        System.out.println("su texto normal: "+oracion);
        System.out.print("su texto cambiado: ");
        for (int i=0; i<nuevaOracion.length; i++){
            System.out.print(nuevaOracion[i]);
        }
        System.out.println(" ");
    }
}
