import com.company.Tdd;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class TddTest {
    private static Tdd tdd;


@Test
@DisplayName("5 Asal Sayı mı?")
    public void isPr(){
    assertEquals(true,tdd.isPrime(5));

}
    @Test
    @DisplayName("5 Fibonacci Serisinde mı?")
    public void isFib(){
        assertEquals(true,tdd.isFibonacci(5));

    }
    @Test
    @DisplayName("5 Fibonacci Serisinde ve Asal Sayı mı ?")
    public void isPrimeAndFibonacci(){
        assertEquals(true,tdd.isPrimeFibonacci(5));

    }

    @Test
    @DisplayName("0 Fibonacci Serisinde ve Asal Sayı mı? ")
    void fibTest() {

    assertEquals(false,tdd.isPrimeFibonacci(0));
    }

    @Test
    @DisplayName("-1 Asal Sayı mı?")
    void primeTest(){
    assertEquals(false,tdd.isPrime(-1));
    }

    @BeforeAll
    static void setMain() {
        tdd=new Tdd();
    }
    //Files.write(Paths.get("log.txt"), message.getBytes()):
      //      logger.info(message);

}

