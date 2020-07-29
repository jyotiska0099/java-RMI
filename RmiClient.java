import java.rmi.*;  
import java.util.Scanner;

public class RmiClient
{  
    public static void main(String args[])
    {  
    	//take values from user
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the 1st integer number : ");
    	int num1 = sc.nextInt();
    	System.out.println("Enter the 2nd integer number : ");
    	int num2 = sc.nextInt();

    	try
    	{  
    		//connect with server
    		Multiplier stub=(Multiplier)Naming.lookup("rmi://localhost:4000/my-server");  
    		//call the remote function
    		System.out.println("The multiplication result is : "+stub.multiply(num1,num2));  
    	}
    	catch(Exception e){}  
    }  
}  