//package ejercicciosBloque7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        int arreglo [] = new int [tamano];
        int c =0;
        int randoms =0;
        
        while(c<tamano){
            int aleatorio = (int) (Math.random()*100);
            for (int i=0; i<tamano;i++){
               if (aleatorio == arreglo[i]){
                randoms++;
                }
            }
            if(randoms == 0){
                arreglo[c] = aleatorio;
                c++;
            }else{
                randoms =0;
            }
        }
        int aux =0;
        for(int i=0; i<tamano;i++){
            for(int j=0; j<tamano-1;j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }    
            }
        }
        
        for (int i=0; i<tamano; i++){
            System.out.print("["+arreglo[i]+"] - ");
        }



















        // for (int i =0; i<tamano; i++){
        //     int aleatoreo = (int) Math.random()*100+1;
        //     int randoms =0;
        //     if (aleatoreo == arreglo[i]){
        //         randoms++;
        //     }else{
        //         i--;
        //     }
        //     if (randoms == 0){
        //         arreglo[i] = aleatoreo;
        //     }
        // }

        // for (int i=0; i<tamano; i++) {
        //     System.out.print("["+arreglo[i]+"] -");
        // }
    }
}
