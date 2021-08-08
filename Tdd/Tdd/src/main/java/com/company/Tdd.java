package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tdd {
    private  static Logger logger;
public Tdd(){
   logger = LogManager.getLogger(Tdd.class);



}
    public    boolean isFibonacci(int number){
        int x= (int) Math.sqrt(5*number*number+4);
        int y= 5*number*number+4;
        if (Math.pow(x,2) == y){
            logger.debug(number+" exists in fibonacci series");

            return true;
        }
        x= (int) Math.sqrt(5*number*number-4);
        y= 5*number*number-4;
        if (Math.pow(x,2)==y){

            logger.debug(number+" exists in fibonacci series");

            return true;
        }
        logger.debug(number+"doesnt exist in fibonacci series");
        return false;
    }


    public boolean isPrime(int number){
        if (number<=1){
            logger.debug(number+" is not a prime number");
            return false;
        }
        else if (number==2){
            logger.debug(number+" is a prime number");
            return true;
        }
        else {
            for (int i=2;i<number;i++){
                if (number%i==0){
                    logger.debug(number+" is a prime number");
                    return false;
                }

            }
        }
        logger.debug(number+" is a prime number");
        return true;
    }
public  boolean isPrimeFibonacci(int number){
    if (isPrime(number)&&isFibonacci(number)){
        return true;
    }else{
        return false;
    }
}

}
