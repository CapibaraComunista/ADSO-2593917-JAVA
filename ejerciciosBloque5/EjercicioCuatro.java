import java.util.Scanner;
public class EjercicioCuatro{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre = entradaTexto.nextLine();

        //char oculta[] = {"s","e","p","t","i","m","a"};
        String oculta = "septima";
        char [] longitud = oculta.toCharArray();

        System.out.println("|--------------------|");
        System.out.println("|======OPCIONES======|");
        System.out.println("|                    |");
        System.out.println("| 1- JUGAR           |");
        System.out.println("| 2- SALIR           |");
        System.out.println("|                    |");
        System.out.println("|======OPCIONES======|");
        System.out.println("|--------------------|");
        byte opcion = entrada.nextByte();
        Boolean enJuego = true; 
        byte vidas = 6;
        Boolean ganar = false;
        char [] ocultaNueva = new char [longitud.length];
        if (opcion == 1){
            while (enJuego == true){
                System.out.println("jugador "+nombre+" ingrese una letra");
                char letra = entradaTexto.next().charAt(0);
                
                boolean valido = false;
                for (int i=0; i<longitud.length; i++){
                    if (letra == longitud[i]){
                       ocultaNueva[i] = letra;
                       valido = true;
                       
                    }
                }

                if (valido == false){
                    vidas--;
                    System.out.println("nao nao una vida menos");
                }else{
                    System.out.println("acertaste");
                }

                if (vidas == 5){
                    System.out.println("o");
                }else if (vidas == 4){
                    System.out.println("o");
                    System.out.println("|");
                }else if (vidas == 3){
                    System.out.println(" o");
                    System.out.println(" |");
                    System.out.println("/");
                }else if (vidas == 2){
                    System.out.println(" o");
                    System.out.println(" |");
                    System.out.println("/ /");
                }else if (vidas == 1){
                    System.out.println(" o");
                    System.out.println(" |-");
                    System.out.println("/ /");
                }else if (vidas == 0){
                    System.out.println(" o");
                    System.out.println("-|-");
                    System.out.println("/ /");
                    System.out.println("=======GAME OVER=======");
                    enJuego = false;
                }

                for (int i=0; i<longitud.length; i++){
                    System.out.print(ocultaNueva[i]+"_");
                }
                System.out.println("");
                
               for (int i=0; i<longitud.length; i++){
                    if (String.valueOf(ocultaNueva).equals(oculta)){
                        ganar = true;
                    }
                }

                if (ganar == true){
                        System.out.println("===================");
                        System.out.println("|  FELICITACIONES |");
                        System.out.println("|     GANASTE     |");
                        System.out.println("| LA PALABRA ERA  |");
                        System.out.println("| "+oculta.toUpperCase()+" |");
                        System.out.println("|=================|");
                        enJuego = false;
                }
            }
        }else if (opcion == 2){
            System.out.println("esta bien no juegues bro");
        }else{
            System.out.println("===ACION INVALIDA===");
        }
    }
}