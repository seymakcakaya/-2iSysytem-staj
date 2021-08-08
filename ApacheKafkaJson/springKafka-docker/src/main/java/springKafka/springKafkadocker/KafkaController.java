package springKafka.springKafkadocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()

public class KafkaController {

    private final KafkaProducer producer;

    private  KafkaController(KafkaProducer producer){
    this.producer  =producer;
    }



    @PostMapping("/publish")
    public void  writeMessageToTopic(@RequestBody Sayi message){

       this.producer.writeMessage(message);


    }





}
