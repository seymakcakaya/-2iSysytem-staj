package FibPrime;

import org.springframework.util.Assert;
import springKafka.springKafkadocker.Sayi;

public class FibAndPrime implements FibonacciPrimeService {


    @Override
    public boolean isPrime(int number) {

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



    @Override
    public boolean isFib(int number) {
        int x= (int) Math.sqrt(5*number*number+4);
        if (x*x == 5*number*number+4){
            return true;
        }
        x= (int) Math.sqrt(5*number*number-4);
        if (x*x == 5*number*number-4){
            return true;
        }
        return false;
    }

    @Override
    public void isFibAndPrime(Sayi number) {
if (getOperation(number)){

    if(isPrime(number.getOperand())&&isFib(number.getOperand())) {
        System.out.println("Hem fib hem primeü");
    }

}


        }

    @Override
    public boolean getOperation(Sayi sayi) {
        if (sayi.getOperation().isEmpty() ){
            System.out.println("Operasyon bilgisi Boş");
            return false;
        }
        else if (!sayi.getOperation().equalsIgnoreCase("Fibonacci+Prime")){
            System.out.println("Operasyon bilgisi geçersiz");
            return false;
        }else return true;

    }
}

