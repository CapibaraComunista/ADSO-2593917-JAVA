import java.util.Date;
public class CajeroElectronico{
    private int tipoLectura;
    private int capacidadTotal;
    private int cantidadDineroDispo;
    private int cantidadBilletes10;
    private int cantidadBilletes20;
    private int cantidadBilletes50;
    private int cantidadBilletes100;
    
    private String nombreBanco;
    private String [] listaTransacciones;
    private String usuarioAdmin;
    private String claveAdmin;
    


    //Metodos

    public CajeroElectronico(int tipoLectura, int capacidadTotal, int cantidadDineroDispo,int cantidadBilletes10,int cantidadBilletes20,int cantidadBilletes50,int cantidadBilletes100, String nombreBanco, String usuarioAdmin, String claveAdmin){

        this.tipoLectura = tipoLectura;
        this.capacidadTotal = capacidadTotal;
        this.cantidadDineroDispo = cantidadDineroDispo;




        
        this.cantidadBilletes10 = cantidadBilletes10;
        this.cantidadBilletes20 = cantidadBilletes20;
        this.cantidadBilletes50 = cantidadBilletes50;
        this.cantidadBilletes100 = cantidadBilletes100;

        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;
        this.listaTransacciones = new String[5];

    }

    public void retirarDineroTarjeta(TarjetaDebito tarjeta, String clave, int valorTarjeta){

    }

    public boolean actualizarBilletes(int valorTarjeta){

        int almacenadoNuevoV = 0;

        //calcular billetes de 100
        int tempBilletes100 = valorTarjeta/100000;

        if (this.cantidadBilletes100 >= tempBilletes100){
            almacenadoNuevoV = valorTarjeta-(tempBilletes100*100000);
        }else{
            tempBilletes100 = 0;
        }
        System.out.println("cantidad de 100 "+tempBilletes100);

        //calcular billetes de 50
        int tempBilletes50 = almacenadoNuevoV/50000;
        if (this.cantidadBilletes50 >= tempBilletes50){
            almacenadoNuevoV = valorTarjeta-(tempBilletes50*50000);
        }else{
            tempBilletes50 = 0;
        }
        System.out.println("cantidad de 50 "+tempBilletes50);

        //calcular billetes de 20 
        
        int tempBilletes20 = almacenadoNuevoV/20000;
        if (this.cantidadBilletes20 >= tempBilletes20){
            almacenadoNuevoV = valorTarjeta-(tempBilletes20*20000);
        }else{
            tempBilletes20 = 0;
        }
        System.out.println("cantidad de 20 "+tempBilletes20);

        //calcular billetes de 10
        int tempBilletes10 = almacenadoNuevoV/10000;
        if(this.cantidadBilletes10 >= tempBilletes10){
            almacenadoNuevoV = valorTarjeta-(tempBilletes10*10000);
        }else{
            tempBilletes10 = 0;
        }
        System.out.println("cantidad de 10 "+tempBilletes10);

        if (almacenadoNuevoV == 0){
            this.cantidadBilletes10 -= tempBilletes10;
            this.cantidadBilletes20 -= tempBilletes20;
            this.cantidadBilletes50 -= tempBilletes50;
            this.cantidadBilletes100 -= tempBilletes100;
            return true;
        }else{
            return false;
        }

    }

    public void actualizarTotalCajero(String usuario, String claveA, int valorTotal, int cantBilletes10, int cantBilletes20, int cantBilletes50, int cantBilletes100){

        if (this.usuarioAdmin.equals(usuario)){
            if (this.claveAdmin.equals(claveA)){
                int valor = (cantBilletes10*10000) + (cantBilletes20*20000) + (cantBilletes50*50000) + (cantBilletes100*100000);
                if (valorTotal == valor){
                    this.cantidadDineroDispo = valor;
                    this.cantidadBilletes10 = cantBilletes10;
                    this.cantidadBilletes20 = cantBilletes20;
                    this.cantidadBilletes50 = cantBilletes50;
                    this.cantidadBilletes100 = cantBilletes100;
                    this.registrarLog("Abastecer", "00000000000000", valorTotal, "GOOD: 200");
                    System.out.println("=== ingreso de dinero exitoso uwu ===");
                }else{
                    System.out.println("nao nao dinero inconsistente");
                    this.registrarLog("Abastecer", "00000000000000", valorTotal, "BAD: 404");
                }
            }else{
                System.out.println("clave denegada unu");
                this.registrarLog("Abastecer", "00000000000000", valorTotal, "BAD: 403");
            }
        }else{
            System.out.println("usuario denegado unu");
            this.registrarLog("Abastecer", "00000000000000", valorTotal, "BAD: 403");
        }

    }

    public void registrarLog(String tipo, String numeroTar, int valorT, String estado){
        Date fecha = new Date();
        String log = fecha.toString()+" || "+numeroTar+" || "+valorT+" || "+estado;

        if (this.listaTransacciones[ this.listaTransacciones.length-1] == null){
            for (int i=0; i<this.listaTransacciones.length; i++){
                if (this.listaTransacciones[i] == null){
                    listaTransacciones[i] = log;
                    break;
                }
            }
        }else{
            for (int i=0; i<this.listaTransacciones.length-1; i++){
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            this.listaTransacciones[this.listaTransacciones.length-1] = log;
        }
    }



    public void imprimirDatosCajero(){

        System.out.println("==============================================================================");
        System.out.println("Tipo de lectura: "+this.tipoLectura);
        System.out.println("Capacidad total: "+this.capacidadTotal);
        System.out.println("Cantidad de dinero disponible: "+this.cantidadDineroDispo);
        System.out.println("==============================================================================");
        System.out.println("Cantidad de biletes uwu");
        System.out.println("Billetes de 10k: "+this.cantidadBilletes10);
        System.out.println("Billetes de 20k: "+this.cantidadBilletes20);
        System.out.println("Billetes de 50k: "+this.cantidadBilletes50);
        System.out.println("Billetes de 100k: "+this.cantidadBilletes100);
        System.out.println("==============================================================================");
        System.out.println("Nombre del banco: "+this.nombreBanco);
        System.out.println("Usuario admin: "+this.usuarioAdmin);
        System.out.println("Clave admin: ****");
        System.out.println("==============================================================================");
        System.out.println("Historial de transacciones: ");
        for (int i=0; i<this.listaTransacciones.length; i++){
            if (this.listaTransacciones[i] != null){
                System.out.println(this.listaTransacciones[i]);
            }
        }
        System.out.println("==============================================================================\n");
    }

    

}