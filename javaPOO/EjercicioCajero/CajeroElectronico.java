import java.time.Instant;
public class CajeroElectronico{

    Instant instante = Instant.now();

    //Atributos:
    private String tipoDeLectura;
    private int cantidadTransaccionesG;
    private int cantidadDeDineroTotal;
    private int cantidadDeDineroDisponle;
    private String nombreBanco;
    private String [] transaccionesLista;
    private String usuarioAdmin;
    private String claveAdmin;

    //Tipo de billetes: 
    private int billetesDe10;
    private int billetesDe20;
    private int billetesDe50;
    private int billetesDe100;

    public CajeroElectronico(String tipoDeLectura, int cantidadDeDineroTotal, int cantidadDeDineroDisponle, String nombreBanco, String usuarioAdmin, String claveAdmin, int billetesDe10, int billetesDe20, int billetesDe50, int billetesDe100, int cantidadTransaccionesG){
        this.tipoDeLectura = tipoDeLectura;
        this.cantidadDeDineroTotal = cantidadDeDineroTotal;
        this.cantidadDeDineroDisponle = cantidadDeDineroDisponle;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = "cristiancito";
        this.claveAdmin = "12345";
        this.billetesDe10 = billetesDe10;
        this.billetesDe20 = billetesDe20;
        this.billetesDe50 = billetesDe50;
        this.billetesDe100 = billetesDe100;
        this.transaccionesLista = new String [cantidadTransaccionesG];

    }

    boolean aprobarPerfil = false;
    boolean aprobarDinero = false;

    public void abastecerCajero(String usaurioA, String claveA, int valorTotal,  int billetesDe10, int billetesDe20, int billetesDe50, int billetesDe100){
        if(usaurioA.equals(usuarioAdmin) && claveA.equals(claveAdmin)){
            int comprobanteValor = (10000*billetesDe10)+(20000*billetesDe20)+(50000*billetesDe50)+(100000*billetesDe100);
            if (comprobanteValor == valorTotal){
                this.cantidadDeDineroDisponle = comprobanteValor;
                this.billetesDe10 = billetesDe10;
                this.billetesDe20 = billetesDe20;
                this.billetesDe50 = billetesDe50;
                this.billetesDe100 = billetesDe100;
                System.out.println("se han actualizado los valores");
                aprobarDinero = true;
            }else{
                System.out.println("dinero no valido");
            }
            aprobarPerfil = true;
        }else{
            System.out.println("datos incorrectos intente nuevamente unu");
        }
        return validacion(aprobarPerfil, aprobarDinero);
    }
    
    public boolean validacion(boolean aproPer, boolean aproDi){
        if(aproPer == true){
            if(aproDi == true){
                return impresionDatosCajero();
            }else{
                System.out.println("nao nao en el dinero");
            }
        }else{
            System.out.println("nao nao en el perfil");
        }
    }

    public void impresionDatosCajero(){
        System.out.println("=========================================================");
        System.out.println("- tipo de lectura: "+this.tipoDeLectura);
        System.out.println("- cantidad de dinero total: "+this.cantidadDeDineroTotal);
        System.out.println("- cantidad de dinero disponible:  "+this.cantidadDeDineroDisponle);
        System.out.println("- nombre del banco: "+this.nombreBanco);
        System.out.println("- usuario admin: "+this.usuarioAdmin);
        System.out.println("- contrasena admin: *******");
        System.out.println("- cantidad billetes de 10: "+this.billetesDe10);
        System.out.println("- cantidad de billetes 20: "+this.billetesDe20);
        System.out.println("- cantidad de billetes de 50: "+this.billetesDe50);
        System.out.println("- cantidad de billetes de 100: "+this.billetesDe100);
        for (int i=0; i<this.transaccionesLista.length; i++){
            System.out.println("-  cantidad de transacciones: "+(i+1));
            this.transaccionesLista[i] = instante.toString();
            System.out.println("==> "+this.transaccionesLista[i]);
        }
        System.out.println("=========================================================");
        System.out.println(" ");

    }

    



}