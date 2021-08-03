import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Statement sta=null;
    public static PreparedStatement psta=null;
    public static Connection con;

    public static void main(String[] args) {
getConnection();
        add();
getAll();


    }
    public static void add() {
        String sorgu = "INSERT INTO seyma (ID,SAYI) VALUES(?,?)";
        int counter = 1;
        double seconds =0;
        try {
            long startTime = System.currentTimeMillis();
            while (counter < 1000) {
                double sayi = (int) (Math.random() * 1000 );
                psta = con.prepareStatement(sorgu);
                psta.setInt(1, counter);
                psta.setDouble(2, sayi);
                psta.executeUpdate();
                counter++;
            }
            long endTime = System.currentTimeMillis();
            double  estimatedTime= (endTime - startTime);
             seconds = (double)estimatedTime/1000;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Veri tabanına ekleme süresi:"+seconds);
    }

    public static void getConnection(){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:xe","system","oracle");
            System.out.println("Bağlantı ve driver çalışıyor");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver çalışmıyor");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Bağlantı Çalışmadı");
        }

    }

    public static void getAll(){

        try {
            String sorgu="SELECT * FROM seyma";
            sta=con.createStatement();
            ResultSet rs=sta.executeQuery(sorgu);
            int counter=1;
            long startTime = System.currentTimeMillis();
            while (counter<1000){
                rs.next();
                counter++;
            }
            long endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
            double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
            System.out.println("Veri' tabani  işlem saniyesi:"+seconds);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
