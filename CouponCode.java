package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CouponCode {
	private static final Logger LOG= LogManager.getLogger(CouponCode.class); 
	
	public static void main(String[] args)
    {
    	
    	int max=1000;
    	int new_number = 0;
    	
    	String chars = "abcdefghijklmnopqrstuvwxzy";
    	Random ch = new Random();
    	char c = chars.charAt(ch.nextInt(chars.length()));   	
    	LOG.info("The reverse of the given number is: " + c); 
    	
    	String char_new = "abcdefghijklmnopqrstuvwxzy";
    	
    	char uppercase = char_new.toUpperCase().charAt(ch.nextInt(chars.length())); 
    	//LOG.info("The given number is: " + c);
         int number = (int)(Math.random()*max);
         String value = String.valueOf(number);
    	
    	   for(int i=0;i<value.length();i++)
    	   {
    		  if(value.charAt(0)==value.charAt(1) || value.charAt(0)==value.charAt(2) || value.charAt(1)==value.charAt(2))
    		  {
    		   break;	
    		  }
    		
    		  else
    		  {
    			 new_number=number;
    			//LOG.info("The  given unique number is: " + new_number);
    		  }
    	   }
    	   LOG.info("The  given unique number is: " + new_number);
	        
          
    	
    	
    	String coupon=c+""+new_number+""+""+uppercase;
    	LOG.info("The coupons is: " + coupon); 
    	
    	

    	 
       }
}

