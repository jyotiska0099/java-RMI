import java.rmi.Remote;
import java.rmi.RemoteException;

//create the interface
public interface Multiplier extends Remote
{  
    public int multiply(int x,int y)throws RemoteException;
}  