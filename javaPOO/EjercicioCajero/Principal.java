import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        //debo crear un panel de opciones para organizar el main
        
        System.out.println("ingrese su usario admin");
        String usuarioAdmin = entradaTexto.nextLine();
        System.out.println("ingrese la clave");
        String claveAdmin = entradaTexto.nextLine(); 
        System.out.println("ingresen la cantidad de dinero que desea ingresar");
        int cantidadValorar = entrada.nextInt();
        System.out.println("ingrese la cantidad de limite del dinero");
        int disponibilidadDinero = entrada.nextInt();
        System.out.println("ingrese la cantidad de billetes de 10");
        int cantidadBilletes10 = entrada.nextInt();
        System.out.println("ingrese la cantidad de billetes de 20");
        int cantidadBilletes20 = entrada.nextInt();
        System.out.println("ingrese la cantidad de billetes de 50");
        int cantidadBilletes50 = entrada.nextInt();
        System.out.println("ingrese la cantidad de billetes de 100");
        int cantidadBilletes100 = entrada.nextInt();

        System.out.println("1 - chip, 2 - nfc, 3 - ambos");
        byte opcion = entrada.nextByte();
        String lectura = "";
        if(opcion >0 && opcion <4){
            if (opcion == 1){
                lectura = "CHIP";
            }else if( opcion == 2){
                lectura = "NFC";
            }else{
                lectura = "CHIP/NFC";
            }
        }
        CajeroElectronico caja1 = new CajeroElectronico(lectura, cantidadValorar, disponibilidadDinero, "Banco SENA", usuarioAdmin, claveAdmin, cantidadBilletes10, cantidadBilletes20, cantidadBilletes50, cantidadBilletes100, 1);

        caja1.abastecerCajero(usuarioAdmin, claveAdmin, cantidadValorar, cantidadBilletes10, cantidadBilletes20, cantidadBilletes50, cantidadBilletes100);

        caja1.impresionDatosCajero();

    }
    
}
