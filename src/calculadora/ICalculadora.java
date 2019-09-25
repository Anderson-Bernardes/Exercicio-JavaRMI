package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface ICalculadora extends Remote{
    float soma(float a, float b) throws RemoteException;
    float subtrai(float a, float b) throws RemoteException;
    float multiplica(float a, float b) throws RemoteException;
    float divide(float a, float b) throws RemoteException;
}

class  Calculadora_impl extends UnicastRemoteObject implements ICalculadora {
    Calculadora_impl() throws RemoteException{
        
    }
    
    
    @Override
    public float soma(float a, float b) throws RemoteException{
        return a+b;
    }
    @Override
    public float subtrai(float a, float b) throws RemoteException{
        return a-b;
    }
    @Override
    public float multiplica(float a, float b) throws RemoteException{
        return a*b;
    }
    @Override
    public float divide(float a, float b) throws RemoteException{
        return a/b;
    }
}
