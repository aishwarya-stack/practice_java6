package www.bridgelabz.demo;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StopWatch {

	private static final Logger LOG= LogManager.getLogger(StopWatch.class); 
	
	

	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;


	public void start()
	{
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
	}


	public void stop() 
	{
	    this.stopTime = System.currentTimeMillis();
	    this.running = false;
	}


	//elaspsed time in milliseconds
	public long getElapsedTime()
	{
	    long elapsed;
	    if (running) {
	         elapsed = (System.currentTimeMillis() - startTime);
	    }
	    else {
	        elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	}


	//elaspsed time in seconds
	public long getElapsedTimeSecs()
	{
	    long elapsed;
	    if (running)
	    {
	        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
	    }
	    else 
	    {
	        elapsed = ((stopTime - startTime) / 1000);
	    }
	    return elapsed;
	}




	
	public static void main(String[] args) {
	    StopWatch s = new StopWatch();
	    s.start();
	    //you want to time goes here
	    s.stop();
	    for(int hours = 0; hours < 24; hours++)
	    {
	        // 60 mins in an hours
	        for(int minutes = 0; minutes < 60; minutes++)
	        {
	           // 60 secs in a min
	           for(int seconds = 0; seconds < 60; seconds++)
	           {
	               // 1000 ms in a sec.
	               for(int ms = 0; ms < 1000; ms++)
	               {
	                  LOG.info(hours + ":" + minutes + ":" + seconds + "." + ms);
	               }
	           }
	        }
	    }
	}
	}
	

