package springKafka.springKafkadocker;


import FibPrime.FibonacciPrimeService;
import FibPrime.FibAndPrime;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumer {


    @KafkaListener(topics = "seymakcakaya",groupId = "seymakcakaya_id")
public void getMessage(Sayi message){
        FibonacciPrimeService fibonacciPrimeService=new FibAndPrime();
        fibonacciPrimeService.isFibAndPrime(message);




}





}
