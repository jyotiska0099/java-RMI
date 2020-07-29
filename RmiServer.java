import java.rmi.*;  
import java.rmi.registry.*;  

public class RmiServer
{  
	public static void main(String args[])
	{  
		try
		{  
			Multiplier stub=new MultiplierRemote();  
			//start the server at port 4000
			Naming.rebind("rmi://localhost:4000/my-server",stub);  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
} 