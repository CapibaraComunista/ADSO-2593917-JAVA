import java.util.Scanner;
public class ciclon2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("coloque cuanto dinero presto");
        int prestamo = entrada.nextInt();
        System.out.println("ingrese cuantas cuotas ha pagado");
        int pagos = entrada.nextInt();
        double porcentaje = 0;
        for (int i=0;i<pagos;i++){
            System.out.println("ingrese el valor de la cuota: " +i);
            int valor = entrada.nextInt();
            porcentaje = (valor*pagos)/100;
        }
        System.out.println("este es su porcentaje: "+porcentaje+"%");
    }
}