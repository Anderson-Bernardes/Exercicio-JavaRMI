package calculadora;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraMain {
    public static void main(String[] args) {
        String nome = "calculadora";
        
        try {
            ICalculadora obejto_rem = new Calculadora_impl();
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1101);
            registry.rebind(nome, obejto_rem);
        } catch (RemoteException ex) {
            Logger.getLogger(CalculadoraMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
