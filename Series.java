package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Series {
	
	private static final Logger LOG= LogManager.getLogger("Series.class"); 
    public static void main(String[] args)
 {
   
    //intialization of variable	
	int first_number=0,second_number=1,next_number,i,number = 0;
	
	//accepting input from user
	LOG.info("Enter the number you want to find fibonacci series");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	
	
	LOG.info(first_number+"\n"+second_number);//printing 0 and 1    
	    
	for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  next_number=first_number+second_number;    
	  LOG.info(""+next_number);  
	  first_number=second_number;    
	  second_number=next_number;    
	}
	 
  }
                 }