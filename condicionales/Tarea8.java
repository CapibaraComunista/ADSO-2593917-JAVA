import java.util.Scanner;
public class Tarea8{
    public static void main (Strng[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero no mayor a 6 digitos");
        int numero_mayor = entrada.nextInt();

        int digito1 = numero_mayor%10;
        int digito2 = (numero_mayor/10)%10;
        int digito3 = (numero_mayor/100)%10;
        int digito4 = (numero_mayor/1000)%10;
        int digito5 = (numero_mayor/10000)%10;
        int digito6 = (numero_mayor/100000)%10;

        //digito 6
        if (digito6 == 9){
            System.out.print("novecientos");
        }else if (digito6 == 8){
            System.out.print("ochocientos");
        }else if (digito6 == 7){
            System.out.print("seteciento");
        }else if (digito6 == 6){
            System.out.print("seiscientos");
        }else if (digito6 == 5){
            System.out.print("quinientos");
        }else if (digito6 == 4){
            System.out.print("cuatrocientos");
        }else if (digito6 == 3){
            System.out.print("trecientos");
        }else if (digito6 == 2){
            System.out.print("doscientos");
        }else if (digito6 == 1){
            if (digito5 == 0 && digito4 == 0){
                System.out.print("cien");
            }else{
                System.out.print("ciento");
            }
        }else if (digito6 == 0){
            System.out.print("")
        }

        //digito 5


        if (digito5 == 9){
            if (digito4 == 0){
                System.out.print("noventa");
            }else{
                System.out.print("noventa y");
            }
        }else if (digito5 == 8){
            if (digito4 == 0){
                System.out.print("ochenta");
            }else{
                System.out.print("ochenta y");
            }
        }else if (digito5 == 7){
            if (digito4 == 0){
                System.out.print("setenta");
            }else{
                System.out.print("setenta y");
            }
        }else if (digito5 == 6){
            if (digito4 == 0){
                System.out.print("sesenta");
            }else{
                System.out.print("setenta y");
            }
        }else if (digito5 == 5){
            if (digito4 == 0){
                System.out.print("cincuenta");
            }else{
                System.out.print("cincuenta y");
            }
        }else if (digito5 == 4){
            if (digito4 == 0){
                System.out.print("cuarenta");
            }else{
                System.out.print("cuarenta y");
            }
        }else if (digito5 == 3){
            if (digito4 == 0){
                System.out.print("treinta");
            }else{
                System.out.print("treinta y");
            }
        }else if (digito5 == 2){
            if (digito4 == 0){
                System.out.print("veinte");
            }else{
                System.out.print("veinti");
            }
        }else if (digito5 == 1){
            if (digito4 == 0){
                System.out.print("diez mil");
            }else if (digito4 == 1){
                System.out.print("once mil");
            }else if (digito4 == 2){
                System.out.print("doce mil");
            }else if (digito4 == 3){
                System.out.print("trece mil");
            }else if (digito4 == 4){
                System.out.print("catorce mil");
            }else if (digito4 == 5){
                System.out.print("quince mil");
            }else if (digito4 == 6){
                System.out.print("dieciseis mil");
            }else if (digito4 == 7){
                System.out.print("diesisiete mil");
            }else if (digito4 == 8){
                System.out.print("diesiocho mil");
            }else if (digito4 == 9){
                System.out.print("diesinueve mil");
            }
        }

        //digito 4

       if (digito4 == 9 && digito5 >1){
        System.out.print("nueve mil");
       }else if ( digito4 == 8 && digito5 >1){
        System.out.print("ocho mil");
       }else if ( digito4 == 7 && digito5 >1){
        System.out.print("siete mil");
       }else if ( digito4 == 6 && digito5 >1){
        System.out.print("seis mil");
       }else if ( digito4 == 5 && digito5 >1){
        System.out.print("cinco mil");
       }else if ( digito4 == 4 && digito5 >1){
        System.out.print("cuatro mil");
       }else if ( digito4 == 3 && digito5 >1){
        System.out.print("tres mil");
       }else if ( digito4 == 2 && digito5 >1){
        System.out.print("dos mil");
       }else if ( digito4 == 1 && digito5 >1){
        System.out.print("mil");
       }

       //digito 3

       if (digito3 == 9){
        System.out.print("novecientos");
       }else if (digito3 == 8){
        System.out.print("ochocientos");
       }else if (digito3 == 7){
        System.out.print("setecientos");
       }else if (digito3 == 6){
        System.out.print("seiscientos");
       }else if (digito3 == 5){
        System.out.print("quinientos");
       }else if (digito3 == 4){
        System.out.print("cuatrocientos");
       }else if (digito3 == 3){
        System.out.print("trecientos");
       }else if (digito3 == 2){
        System.out.print("doscientos");
       }else if (digito3 == 1){
            if (digito2 == 0 && digito1 == 0){
                System.out.print("cien");
            }else{
                System.out.print("ciento");
            }
       }


       //digito 2
    }
}