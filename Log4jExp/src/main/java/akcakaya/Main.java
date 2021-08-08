package akcakaya;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jdk.internal.net.http.common.Log;

public class Main {
	 public final static Logger log = LogManager.getLogger(Main.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.info("For d�ng�s� ba�lad�");
	
		        for (int i=1;i<1600;i++){
		        	if(isPrime(i)&&isFibonacci(i)) {
		        		log.info(i+". d�ng�de");
		        log.info(i+" hem fibonacci serisinde var hem de asal say�");
		        	}
		            
	
		        }

log.info("D�ng� bitti");

		    }
		    private static boolean isPrime(int number){
		        if (number<=1){
		            
		            return false;
		        }

		        else if (number==2){
		            
		            return true;
		        }

		        else {
		             for (int i=2;i<number;i++){
		                 if (number%i==0){
		                     return false;
		                 }

		            }
		        }
		        return true;
		    }

		    private  static  boolean isFibonacci(int number){
		       int x= (int) Math.sqrt(5*number*number+4);
		       if (x*x == 5*number*number+4){
		    	   log.debug(number+" exists in fibonacci series");
		          
		           return true;
		       }
		         x= (int) Math.sqrt(5*number*number-4);
		        if (x*x == 5*number*number-4){

			    	   log.debug(number+" exists in fibonacci series");
		           
		            return true;
		        }
		      
		        return false;
		    }


		


	}


