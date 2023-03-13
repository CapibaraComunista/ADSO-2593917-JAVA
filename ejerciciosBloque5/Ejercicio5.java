import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        //creacion de las entradas de texto
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        //cracion del tablero de 3*3
        int [][] tablero = new int [3][3];

        //indicando quien va a ser cada jugador
        System.out.println("jugador 1 ingrese su nombre");
        String juadorUno = entradaTexto.nextLine();
        System.out.println("jugador 2 ingrese su nombre");
        String juadorDos = entradaTexto.nextLine();
        
        //impresion del tablero
        for (int i=0; i<tablero.length;i++){
            for (int j=0; j<tablero[i].length; j++){
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println(" ");
        }
        boolean enJuego = true;
        int jugador = 1;
        byte fila;
        byte columna;
        boolean tableroVacio = true;
        //boolean ganador = false;
        boolean empate = false;
        boolean repetido = false;

        //creacion del ciclo donde los jugadores diran sus movimientos uwu
        while (enJuego == true){
            if (jugador == 1){
                System.out.println("juador: "+juadorUno+" en que fila se quiere ubicar");
                fila = entrada.nextByte();
                System.out.println("juador: "+juadorUno+" en que columna se quiere ubicar");
                columna = entrada.nextByte();
            }else{
                System.out.println("juador: "+juadorDos+" en que fila se quiere ubicar");
                fila = entrada.nextByte();
                System.out.println("juador: "+juadorDos+" en que columna se quiere ubicar");
                columna = entrada.nextByte();
            }
            //validacion del tablero para asignar el movmiento
            if (fila >=0 && fila <3 &&(columna >=0 && columna <3)){
                if (tablero[fila][columna] == 0){
                    tableroVacio = true;
                }else{
                    tableroVacio = false;
                }
            }else{
                //esto ya lo hace de forma automatica la consola XD
                System.out.println("se salio de las pos de la matriz");
            }
            //si el tablero esta vacio se marca una x || o dependiendo del jugador 
            if (tableroVacio == true){
                if(jugador == 1){
                    tablero[fila][columna] = 'x';
                }else{
                    tablero[fila][columna] = 'o';
                }
            }else{
                System.out.println("nao nao repeti la juagda rey");
                repetido = true;
            }
            //impresion del tablero actualizado con los movimientos
            for (int i=0; i<tablero.length;i++){
                for (int j=0; j<tablero[i].length; j++){
                    System.out.print("["+tablero[i][j]+"]");
                }
                System.out.println(" ");
            }
            //validar empate
            for (int i=0; i<tablero.length; i++){
                for (int j=0; j<tablero[i].length; j++){
                    if(tablero[i][j] == 0){
                        empate = false;
                    }else{
                        empate = true;
                    }
                }
            }
            //validar si la jugada es ganadora:
            //filas
            if ((tablero[0][0] == tablero[0][1]  && tablero[0][1] == tablero[0][2] && tablero[0][0] !=0 ) ||
                (tablero[1][0] == tablero[1][1]  && tablero[1][1] == tablero[1][2] && tablero[1][0] !=0 ) ||
                (tablero[2][0] == tablero[2][1]  && tablero[2][1] == tablero[2][2] && tablero[2][0] !=0 ) ||
            //columnas
                (tablero[0][0] == tablero[1][0]  && tablero[1][0] == tablero[2][0] && tablero[0][0] !=0 ) ||
                (tablero[0][1] == tablero[1][1]  && tablero[1][1] == tablero[2][1] && tablero[0][1] !=0 ) ||
                (tablero[0][2] == tablero[1][2]  && tablero[1][2] == tablero[2][2] && tablero[0][2] !=0 ) ||
            //esquinas
                (tablero[0][0] == tablero[1][1]  && tablero[1][1] == tablero[2][2] && tablero[0][0] !=0 ) ||
                (tablero[2][0] == tablero[1][1]  && tablero[2][0] == tablero[0][2] && tablero[2][0] !=0 )){
    
                if (jugador == 1){
                    System.out.println("=====FELICIDADES "+juadorUno.toUpperCase()+" GANASTE=====");
                }else{
                    System.out.println("=====FELICIDADES "+juadorDos.toUpperCase()+" GANASTE=====");
                }
                enJuego = false; 
            }else if (empate == true){
                System.out.println("====EMPATE====");
                enJuego = false;
            }else{
                if (repetido == false){
                    jugador = (jugador%2)+1;
                }
            }
        }
    }
}