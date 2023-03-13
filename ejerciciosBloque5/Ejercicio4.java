import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        
        String oculta = "chamo";
        System.out.println("usuario ingrese su nombre");
        String nombre = entradaTexto.nextLine();
        boolean enJuego = true;
        byte vidas = 6;
        byte letraC = 0;
        byte letraH = 0;
        byte letraA = 0;
        byte letraM = 0;
        byte letraO = 0;
        String letra;
        char [] palabra = new char [5];
        char [] otraOculta = oculta.toCharArray();

        int i =1;
        int l =0;

        for (int contador =0; contador<otraOculta.length; contador++){
            otraOculta[i] = '-';
        }

        while (enJuego == true){
            System.out.println("|------------------|");
            System.out.println("| opciones         |");
            System.out.println("|                  |");
            System.out.println("| 1- JUGAR         |");
            System.out.println("| 2- SALIR         |");
            System.out.println("|------------------|");
            System.out.println("senorit@ "+nombre+" que desea hacer?");
            byte opcion = entrada.nextByte();
            if (opcion == 1){
                System.out.println("comprobando");
                for (int k=0; k<i; k++){
                        System.out.println("¬¬¬¬ jugador: "+nombre+" ¬¬¬¬");
                        System.out.println("ingrese una letra ");
                        letra = entradaTexto.nextLine();
                        letra.charAt(l);
                        int comprobante = letra.length();
                    if (comprobante == 1){
                        if(letra.charAt(l) == 99){
                            letraC++;
                            
                        }else if(letra.charAt(l) == 104){
                            letraH++;
                            
                        }else if(letra.charAt(l) == 97){
                            letraA++;
                            
                        }else if(letra.charAt(l) == 109){
                            letraM++;
                            
                        }else if(letra.charAt(l) == 111){
                            letraO++;
                            
                        }else{
                            vidas--;
                            System.out.println("te quedan: "+vidas+" vidas");
                        }
                    }else{
                        System.out.println("ingrese solo 1 letra xd");
                        i--;
                    }

                    if (letraC == 1){
                        palabra[l] = letra.charAt(l);
                        for (int j=0; j<=5; j++){
                            otraOculta[j] = palabra[l];
                        }
                        i++;
                    }else if (letraH == 1){
                        palabra[l] = letra.charAt(l);
                        for (int j=0; j<=5; j++){
                            otraOculta[j] = palabra[l];
                        }
                        i++;
                    }else if (letraA == 1){
                        palabra[l] = letra.charAt(l);
                        for (int j=0; j<=5 ; j++){
                            otraOculta[j] = palabra[l];
                        }
                        i++;
                    }else if (letraM == 1){
                        palabra[l] = letra.charAt(l);
                        for (int j=0; j<=5; j++){
                            otraOculta[j] = palabra[l];
                        }
                        i++;
                    }else if(letraO == 1){
                        palabra[l] = letra.charAt(l);
                        for (int j=0; j<=5; j++){
                            otraOculta[j] = palabra[l];
                        }
                        i++;
                    }
                    for(int j=0; j<=5; j++){
                        System.out.print(otraOculta[j]);
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
                }
            }else if (opcion == 2){
                System.out.println("tabien bro no juegues");
                enJuego = false;
            }else{
                System.out.println("eres un invalido");
            }
            
        }
    }
}
