import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class Member {
    public static void main(String[] args) {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        Map<Integer, Integer> member = hazelcastInstance.getMap( "Sayılar" );

        int counter=1;
        long startTime = System.currentTimeMillis();
        while (counter<100000){
            int number=(int)(Math.random()*100000);
            member.put(counter,number);
            counter++;
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println(" member işlem saniyesi:"+seconds);


    }
}
