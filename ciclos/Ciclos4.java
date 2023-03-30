import java.util.Scanner;
public class Ciclos4{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        //while (opcion !=3 ){
        
        int opcion=0;
        while (opcion !=3 ){
            System.out.println("|-----------------------------------------------");
            System.out.println("| 1. docente                                    ");
            System.out.println("| 2. Estudiante                                 ");
            System.out.println("| 3. salir                                      ");
            System.out.println("|-----------------------------------------------");
            System.out.println("escoga una opcion");
            opcion = entrada.nextInt();
            if (opcion == 1){
                System.out.println("se encuentra actualmente en el perfil de docente");
                System.out.println("ingrese cuantas notas va a calcular");
                int n = entrada.nextInt();
                float suma = 0;
                for (int i=1;i<=n;i++){
                System.out.println("ingrese las notas");
                float nota = entrada.nextFloat();
                suma = suma + nota; 
                }
                float promedio = suma/n;
                System.out.println("este es su promedio "+promedio);
            }else if (opcion == 2){
                System.out.println("se encuentra actualmente en el perfil del estudiante");
                System.out.println("ingrese cuantas notas va a calcular");
                int n1 = entrada.nextInt();
                float suma1 = 0;
                for (int i=1;i<=n1;i++){
                System.out.println("ingrese sus notas");
                float nota1 = entrada.nextFloat();
                suma1 =  suma1 + nota1;
                }
                float promedio1 = suma1/n1;
                System.out.println("este es su promedio "+promedio1);
            }
        }
    }
}
