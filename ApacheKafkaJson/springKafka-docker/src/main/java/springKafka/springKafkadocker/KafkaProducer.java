package springKafka.springKafkadocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

private   String topic="seymakcakaya";

@Autowired
private KafkaTemplate<String, Sayi> kafkaTemplate;
//private KafkaTemplate<String, String> kafkaTemplate;


public  void writeMessage(Sayi msg){
    System.out.println("Producter da");
    this.kafkaTemplate.send(topic,msg);
    System.out.println("Producter455 da");


}


}
