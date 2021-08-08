package FibPrime;

import springKafka.springKafkadocker.Sayi;

public interface FibonacciPrimeService {
    boolean isPrime(int number);
   boolean isFib(int number);
  void  isFibAndPrime(Sayi number);
   boolean getOperation(Sayi sayi);

}
