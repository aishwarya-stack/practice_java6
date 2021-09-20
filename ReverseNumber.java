package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ReverseNumber {
	
	private static final Logger LOG= LogManager.getLogger(ReverseNumber.class); 
    public static void main(String[] args)
    {
    	//declaration and intialization
    	int number, reverse = 0;  
    	
    	LOG.info("Enter the number for reverse");
    	Scanner sc=new Scanner(System.in);
    	number=sc.nextInt();
    	
    	while(number!= 0)   
    	{  
    	int remainder = number % 10;  
    	reverse = reverse * 10 + remainder;  
    	number = number/10;  
    	} 
    	
    	System.out.println("The reverse of the given number is: " + reverse);  
    }
}