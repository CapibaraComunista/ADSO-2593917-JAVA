import java.util.Scanner;
// creacion del objeto
public class Triki{
    //crear los atributos
    private String jugador1;
    private String jugador2;
    private int turno;
    private char tablero[][];
    private boolean enJuego;
    private int cantJugadas;

    //crear contructores
    public Triki() {
        this.jugador1 = "";
        this.jugador2 = "";
        this.turno = 1;
        this.enJuego = true;
        this.cantJugadas = 0;
        this.tablero = new char [3][3];
        this.limpiarTablero();
    }
    //funcion para limpiar el tablero
    public void limpiarTablero(){
        for (int i=0; i<this.tablero.length; i++){
            for (int j=0; j<this.tablero[i].length; j++){
                this.tablero[i][j] = '-';
            }
        }
    }
    //funcion para imprimir el tablero
    public void imprimirTablero(){
        for (int i=0; i<this.tablero.length; i++){
            for (int j=0; j<this.tablero[i].length; j++){
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
        }
    }

    public void start(){

        System.out.println("ingrese el jugador 1: ");
    }
}