package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	

public class PerfectNumber {
private static final Logger LOG= LogManager.getLogger("PerfectNumber.class");
public static void main(String[] args)
{
	//declarartion and intialization
	int number;
	int sum=0;
	
	//enter the number 
	LOG.info("Enter the number to find perfect number or not");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	
	for(int i=1;i<number;i++)
	   {
	     if(number%i==0)
	      {
		    LOG.info(""+i);
		    sum=sum+i; //find the total of divisor
	      }
       	else
	      {
		      break;
	      }
	     LOG.info("sum is"+sum);
	   }
	
	//check it is perfect or not
	if(sum==number)
	{
		LOG.info("number is perfect"+number);
	}
	else
	{
		LOG.info("not perfect number");
	}
}

}
