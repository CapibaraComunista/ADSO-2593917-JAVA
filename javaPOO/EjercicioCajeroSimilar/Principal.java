
public class Principal{
    public static void main(String [] args){
        
        CajeroElectronico caja1 = new CajeroElectronico(3, 250000000, 1500000, 50, 50, 0, 0, "Banco IGFN", "cristiancito", "6789");

        caja1.actualizarTotalCajero("cristiancito", "6789", 1000000, 100, 0, 0, 0);
        caja1.imprimirDatosCajero();
    }
}