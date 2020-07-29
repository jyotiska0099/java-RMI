import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;  

public class MultiplierRemote extends UnicastRemoteObject implements Multiplier 
{
	public MultiplierRemote()throws RemoteException
	{
		super(0);  
	}
	//create the function
	public int multiply(int x, int y)
	{
		return x*y;
	}
}