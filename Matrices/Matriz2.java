import java.util.Scanner;
public class Matriz2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // definiendo el mapa del kaberinto 
        int matriz [] [] = {
            {1,1,1,1,1,1,1},
            {1,0,0,0,1,0,3},
            {1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1},
            {2,0,1,0,0,0,1},
            {1,1,1,1,1,1,1}
        };
        

        // ciclo del juego
        boolean jugando = true;
        int pos_f = 4, pos_c =0;
        while(jugando){
            //imprimiendo el laberinto 
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]);
    
                }
                System.out.println("");
            }
            
            // imprimiendo el menu
            System.out.println("1. arriba   2. abajo   3. derecha    4. izquierda");
            int movimiento = entrada.nextInt();
            //condiciones para movimientos 
            if (movimiento == 1){
                if(matriz[pos_f-1][pos_c] == 0){
                    matriz[pos_f-1][pos_c] = 2;
                    matriz[pos_f][pos_c] = 0;
                    pos_f = pos_f-1;
                    pos_c = pos_c;
                }else if (matriz[pos_f-1][pos_c] == 3){
                    jugando = false;
                            
                }

            }
            if (movimiento == 2){
                if(matriz[pos_f+1][pos_c] == 0){
                    matriz[pos_f+1][pos_c] = 2;
                    matriz[pos_f][pos_c] = 0;
                    pos_f = pos_f+1;
                    pos_c = pos_c;
                }else if (matriz[pos_f+1][pos_c] == 3){
                    jugando = false;
                            
                }
            }
            if (movimiento == 3){
                if(matriz[pos_f][pos_c+1] == 0){
                    matriz[pos_f][pos_c+1] = 2;
                    matriz[pos_f][pos_c] = 0;
                    pos_f = pos_f;
                    pos_c = pos_c+1;
                }else if (matriz[pos_f][pos_c+1] == 3){
                    jugando = false;
                            
                }
            }
            if (movimiento == 4){
                if(matriz[pos_f-1][pos_c] == 0){
                    matriz[pos_f-1][pos_c] = 2;
                    matriz[pos_f][pos_c] = 0;
                    pos_f = pos_f-1;
                    pos_c = pos_c;
                }else if (matriz[pos_f-1][pos_c] == 3){
                    jugando = false;
                }
            }
            //comnidcicio para un movimiento no valido
            if (movimiento<1 || movimiento >4){
                System.out.println("NO SE PUEDE JUGAR");
            }
        }
        System.out.println("CONGRATULATIONS - LEVEL COMPLETE - YOUR THE BEST CONTINUE THAT");
    }
}
