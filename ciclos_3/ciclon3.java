import java.util.Scanner;
public class ciclon3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuantos simulacros desea realizar");
        double simulacros = entrada.nextInt();
        double pagos = 0;
        double  interes = 0;
        double  aumento = 0;
        double  resta = 0;
        for (int i=0;i<simulacros;i++){
            System.out.println("----------tasas de interes---------------------------------------");
            System.out.println("menos de 1.000,000$ tiene un 2% de interes");
            System.out.println("mas de 1.000,000$ y menos de 2.500,000% un 3% de interes");
            System.out.println("mas de 2.500,000$ y menos de 5.000,000% un 5% de interes");
            System.out.println("mas de 5.000,000$ 8% de interes");
            System.out.println("----------------------------------------------------------------");
            System.out.println("ingrese cuanto dinero desea creditar");
            int credito = entrada.nextInt();
            if (credito<1000000){
                System.out.println("ingrese en cuantas cuotas desea sacar el credito");
                int cuotas = entrada.nextInt();
                System.out.println("ingrese en que fecha le gustaria realizar sus pagos");
                int fecha = entrada.nextInt();
                System.out.println("---------------va a pagar en "+cuotas+" cuotas su prestamo de: "+credito);
                for (int j=0;j<cuotas;j++){
                    pagos = credito/cuotas;
                    interes = credito*1.2;
                    aumento = interes*0.2;
                    System.out.println("cuota: "+i+" queda en: "+pagos);
                }
                System.out.println("desea adelantar cuotas? oprima 1 si le gustaria adelantar, de lo contrario ingrese 2");
                int respuesta = entrada.nextInt();
                if (respuesta == 1){
                    System.out.println("ingrese cuanto desea adelantar");
                    int adelanto = entrada.nextInt();
                    resta = (credito-adelanto)*1.2;
                    System.out.println("su deuda era: "+interes+" pero como realizo un abono de:"+adelanto+" quedo en:"+resta);
                }else{
                    System.out.println("recuerde realizar sus pagos todos los "+fecha+" de cada mes");
                }
                System.out.println("cuota: "+i+" queda de: "+pagos+"$ este seria su interes"+aumento+" y este es su nuevo "+interes);
            }else if (credito>=1000000 && credito<2500000){
                System.out.println("ingrese en cuantas cuotas desea sacar el credito");
                int cuotas = entrada.nextInt();
                System.out.println("ingrese en que fecha le gustaria realizar sus pagos");
                int fecha = entrada.nextInt();
                System.out.println("---------------va a pagar en "+cuotas+" cuotas su prestamo de: "+credito);
                for (int j=0;j<cuotas;j++){
                    pagos = credito/cuotas;
                    interes = credito*1.3;
                    aumento = interes*0.3;
                    System.out.println("cuota: "+i+" queda en: "+pagos);
                }
                System.out.println("desea adelantar cuotas? oprima 1 si le gustaria adelantar, de lo contrario ingrese 2");
                int respuesta = entrada.nextInt();
                if (respuesta == 1){
                    System.out.println("ingrese cuanto desea adelantar");
                    int adelanto = entrada.nextInt();
                    resta = (credito-adelanto)*1.3;
                    System.out.println("su deuda era: "+interes+" pero como realizo un abono de:"+adelanto+" quedo en:"+resta);
                }else{
                    System.out.println("recuerde realizar sus pagos todos los "+fecha+" de cada mes");
                }
                System.out.println("cuota: "+i+" queda de: "+pagos+"$ este seria su interes"+aumento+" y este es su nuevo "+interes);
            }else if (credito>=2500000 && credito<5000000){
                System.out.println("ingrese en cuantas cuotas desea sacar el credito");
                int cuotas = entrada.nextInt();
                System.out.println("ingrese en que fecha le gustaria realizar sus pagos");
                int fecha = entrada.nextInt();
                System.out.println("---------------va a pagar en "+cuotas+" cuotas su prestamo de: "+credito);
                for (int j=0;j<cuotas;j++){
                    pagos = credito/cuotas;
                    interes = credito*1.5;
                    aumento = interes*0.5;
                    System.out.println("cuota: "+i+" queda en: "+pagos);
                }
                System.out.println("desea adelantar cuotas? oprima 1 si le gustaria adelantar, de lo contrario ingrese 2");
                int respuesta = entrada.nextInt();
                if (respuesta == 1){
                    System.out.println("ingrese cuanto desea adelantar");
                    int adelanto = entrada.nextInt();
                    resta = (credito-adelanto)*1.5;
                    System.out.println("su deuda era: "+interes+" pero como realizo un abono de:"+adelanto+" quedo en:"+resta);
                }else{
                    System.out.println("recuerde realizar sus pagos todos los "+fecha+" de cada mes");
                }
                System.out.println("cuota: "+i+" queda de: "+pagos+"$ este seria su interes"+aumento+" y este es su nuevo "+interes);
            }else if (credito>5000000){
                System.out.println("ingrese en cuantas cuotas desea sacar el credito");
                int cuotas = entrada.nextInt();
                System.out.println("ingrese en que fecha le gustaria realizar sus pagos");
                int fecha = entrada.nextInt();
                System.out.println("---------------va a pagar en "+cuotas+" cuotas su prestamo de: "+credito);
                for (int j=0;j<cuotas;j++){
                    pagos = credito/cuotas;
                    interes = credito*1.8;
                    aumento = interes*0.8;
                    System.out.println("cuota: "+i+" queda en: "+pagos);
                }
                    System.out.println("desea adelantar cuotas? oprima 1 si le gustaria adelantar, de lo contrario ingrese 2");
                    int respuesta = entrada.nextInt();
                if (respuesta == 1){
                    System.out.println("ingrese cuanto desea adelantar");
                    int adelanto = entrada.nextInt();
                    resta = (credito-adelanto)*1.8;
                    System.out.println("su deuda era: "+interes+" pero como realizo un abono de:"+adelanto+" quedo en:"+resta);
                }else{
                    System.out.println("recuerde realizar sus pagos todos los "+fecha+" de cada mes");
                }
                System.out.println("cuota: "+i+" queda de: "+pagos+"$ este seria su interes"+aumento+" y este es su nuevo "+interes);
            }

        }
    }
}