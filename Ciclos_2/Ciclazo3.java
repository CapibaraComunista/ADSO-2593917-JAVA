import java.util.Scanner;
public class Ciclazo3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int entero = entrada.nextInt();
       
            for (int j=0;j<=entero;j++){
                int nuevo = 0;
                int i = 1;
                int aleatoreo=(int)(Math.random()*100);
                while(i<=aleatoreo){
                    if(aleatoreo%i ==0){
                    nuevo++;
                }
                i++;
                
            }
            if (nuevo==2){
                System.out.print("primos aleatoreos:");
                System.out.println("primo generado " + aleatoreo);
                
            }
          
               
        }    
            
    }
}

