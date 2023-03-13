//package ejercicciosBloque7;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre ; 
        System.out.println("ingrese un nombre");
        nombre = entrada.nextLine();
        boolean validacion = true;
        byte opcion =0;
        int mesesP [] = new int [12];
        int veces =0;
        int mes [] = new int [12]; 
        while(validacion == true){
            System.out.println("-------------------------------------------");
            System.out.println("1 registre pago mensual - year 2019        ");
            System.out.println("2 ver pago todos los meses - year 2019     ");
            System.out.println("3 ver pago mes especifico                  ");
            System.out.println("4 salir                                    ");
            System.out.println("-------------------------------------------");
            System.out.println("ingrese una opcion");
            opcion = entrada.nextByte();

            if (opcion == 1){
                System.out.println("ingrese el mes a registrar");
                mes[veces] = entrada.nextInt();
                System.out.println("ingrese el pago");
                mesesP[veces] = entrada.nextInt();
                veces++;
            }else if( opcion == 2){
                for(int i =0; i<12; i++){
                    System.out.println("[ pago: "+mesesP[i]+" mes: "+mes[i]+"]");
                }
            }else if(opcion == 3){
                System.out.println("escoga el mes que desea observar");
                int observar ;
                observar = entrada.nextInt();
                for (int i=0; i<1; i++){
                    if(mesesP[i] > 0){
                        if(observar == 1){
                            System.out.println("se encuentra en el mes enero");
                            System.out.println("pago: "+mesesP[0]);
                        }else if(observar == 2){
                            System.out.println("se encuentra en el mes febrero");
                            System.out.println("pago: "+mesesP[1]);
                        }else if(observar == 3){
                            System.out.println("se encuentra en el mes marzo");
                            System.out.println("pago: "+mesesP[2]);
                        }else if(observar == 4){
                            System.out.println("se encuentra en el mes abril");
                            System.out.println("pago: "+mesesP[3]);
                        }else if(observar == 5){
                            System.out.println("se encuentra en el mes mayo");
                            System.out.println("pago: "+mesesP[4]);
                        }else if(observar == 6){
                            System.out.println("se encuentra en el mes junio");
                            System.out.println("pago: "+mesesP[5]);
                        }else if(observar == 7){
                            System.out.println("se encuentra en el mes julio");
                            System.out.println("pago: "+mesesP[6]);
                        }else if(observar == 8){
                            System.out.println("se encuentra en el mes agosto");
                            System.out.println("pago: "+mesesP[7]);
                        }else if(observar == 9){
                            System.out.println("se encuentra en el mes septiembre");
                            System.out.println("pago: "+mesesP[8]);
                        }else if(observar == 10){
                            System.out.println("se encuentra en el mes octubre");
                            System.out.println("pago: "+mesesP[9]);
                        }else if(observar == 11){
                            System.out.println("se encuentra en el mes noviembre");
                            System.out.println("pago: "+mesesP[10]);
                        }else if(observar == 12){
                            System.out.println("se encuentra en el mes diciembre");
                            System.out.println("pago: "+mesesP[11]);
                        }else{
                            System.out.println("valor no encontrado");
                        }
                    }else{
                        System.out.println("mes no encontrado, ya que no ha sido registrado su pago");
                    }
                }
            }else if(opcion == 4){
                validacion = false;
            }else{
                System.out.println("opcion invalida");
            }
        }
    }
}
