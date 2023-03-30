import java.util.Scanner;
public class Matriz3_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de filas que desea observar");
        int filas = entrada.nextInt();
        System.out.println("ingrese la cantidad de columnas que desea observar");
        int columnas = entrada.nextInt();
        int matriz_vacia [][] = new int [filas][columnas];
        
        //llenando las matrizes con ceros 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_vacia[i][j] = 0;
            }
        }
        //enseñando la matriz
        for (int i = 0; i < matriz_vacia.length; i++) {
            for (int j = 0; j < matriz_vacia.length; j++) {
                System.out.print("["+matriz_vacia[i][j]+"]");
            }
            System.out.println("");
        }
        //determninando la cantidad de bombas y su respectiva ubicacion
        //System.out.println("ingrese la cantidad de bombas que desea agregar");
        //int bombas = entrada.nextInt();
        int n_col=0, n_fil=0;
        int ubicacion =0;
        for (int i = 0; i < matriz_vacia.length; i++) {
            for (int j = 0; j < matriz_vacia.length; j++) {
                System.out.println("se encuentra en la poscicion fila: "+(i+1)+" y columna: "+(j+1));
                System.out.println("ingrese 1 si desea agregar una bomba en esa posicicion, de lo contraio un 0");
                ubicacion = entrada.nextInt();
                matriz_vacia[i][j] = ubicacion;
                //la ubicacion donde seran reemplazadas las posiciones de 0 por 2
                if (matriz_vacia[i][j] == 1){
                    n_col = matriz_vacia[i][j];
                    n_fil = matriz_vacia[i][j];
                    matriz_vacia[n_col+1][n_fil+1] = 2;
                    matriz_vacia[n_col+1][n_fil] = 2;
                    matriz_vacia[n_col][n_fil+1] = 2;
                    matriz_vacia[n_col+1][n_fil] = 2;
                    matriz_vacia[n_col][n_fil+1] = 2;
                    matriz_vacia[n_col+1][n_fil] = 2;
                    matriz_vacia[n_col][n_fil+1] = 2;
                    matriz_vacia[n_col+1][n_fil] = 2;
                }
            }
        }
        //enseñando la nueva matriz con las bombas puestas con sus respectivas explosiones
        for (int i = 0; i < matriz_vacia.length; i++) {
            for (int j = 0; j < matriz_vacia.length; j++) {
                System.out.print("["+matriz_vacia[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
