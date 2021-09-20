package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class numberPrime {

	private static final Logger LOG= LogManager.getLogger(numberPrime.class); 
	public static void main(String[] arg)
	{
	 int i,m=0,flag=0;      
	  int n=3;//it is the number to be checked    
	  m=n/2;      
	  if(n==0||n==1)
	  {  
	   LOG.info(n+" is not prime number");      
	  }
	  else
	  {  
	   for(i=2;i<=m;i++)
	   {      
	    if(n%i==0)
	    {      
	     LOG.info(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  
	   { 
		   LOG.info(n+" is prime number");
		   }  
	  }//end of else  
	}    
	   
	}


