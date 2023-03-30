import java.util.Scanner;
public class Ejercicioa6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int tamano = entrada.nextInt();
        int arreglo_o[] = new int[tamano];
        int primos = 0, noprimos = 0, aumento = 0;
        for (int i = 0; i < arreglo_o.length; i++) {
            System.out.println("ingrese el valor de la poscicion: "+(i+1));
            arreglo_o[i] = entrada.nextInt();

            if (arreglo_o[i]%(i+1) ==0){
                aumento++;
            }
            if (aumento == 2){
                primos++;
            }else {
                noprimos++;
            }
            //primos =0;
            //noprimos=0;
        }
        int primo[] = new int[primos];
        int noprimo[] = new int[noprimos];

        primos = 0;
        noprimos = 0;
        int otrosprimos =0;
        int otrosnoprimos =0;

        for (int i=0;i<arreglo_o.length-1;i++){
            if (arreglo_o[i]%(i+1) ==0){
                aumento++;
            }
            if (aumento ==2){
                primo[primos] = arreglo_o[i];
                primos++;
                otrosprimos++;
            }else{
                noprimo[noprimos] = arreglo_o[i];
                noprimos++;
                otrosnoprimos++;
            }
            primos =0;
            noprimos =0;
        }
        System.out.println("numeros primos: ");
        for (int i = 0;i<otrosprimos;i++){
            System.out.print(primo[i]+" - ");
        }
        System.out.println(" ");


        System.out.println("numeros no primos: ");
        for (int i = 0; i < otrosnoprimos; i++) {
            System.out.print(noprimo[i]+" - ");
        }
    }
}
