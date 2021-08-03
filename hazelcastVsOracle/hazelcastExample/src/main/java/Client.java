import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class Client {
    public static void main(String[] args) {

        HazelcastInstance hazelcastInstance=HazelcastClient.newHazelcastClient();
        Map<Integer, Integer> client = hazelcastInstance.getMap( "Sayılar" );
        int counter=1;
        long startTime = System.currentTimeMillis();
        while (counter<1000){
            int number=(int)(Math.random()*100000);
            client.get(counter);
            counter++;
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("Client işlem saniyesi:"+seconds);

    }
    }
