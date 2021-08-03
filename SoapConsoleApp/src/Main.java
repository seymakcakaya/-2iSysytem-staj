import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		Scanner scanner = new Scanner(System.in); 
		CalculatorServis calculatorService=new CalculatorServis();
 System.out.println("Hesap Makinesi");
 System.out.println("Ýþlem Yapmak Ýstediðiniz Sayýlarý Yazýnýz:");
 System.out.print("Birinci sayi:");
 firstNumber=scanner.nextInt();
 System.out.print("Ýkinci sayi sayi:");
 secondNumber=scanner.nextInt();
 System.out.println("Ýþlem Türünü belirleyiniz:");
 System.out.println("Toplama iþlemi için 1");
 System.out.println("Çýkarma iþlemi için 2");
 System.out.println("Bölme  iþlemi için 3");
 System.out.println("Çarpma iþlemi için 4 ");
 System.out.println("Yapmak istediðiniz iþlem:");
 int secim= scanner.nextInt();
 System.out.println("Ýþlem ve sonucu:");

  
  switch(secim) {
  case 1:
	  System.out.println(firstNumber+" + "+ secondNumber+" = "+  calculatorService.addition(firstNumber, secondNumber));
  
    break;
  case 2:
	  System.out.println(firstNumber+" - "+ secondNumber+" = "+	  calculatorService.division(firstNumber, secondNumber) );

	    break;
    
  case 3:
	  System.out.println(firstNumber+" /"+ secondNumber+" = "+calculatorService.division(firstNumber, secondNumber));
	  
	    break;
	  case 4:
		  System.out.println(firstNumber+" * "+ secondNumber+" = " +  calculatorService.multiplication(firstNumber, secondNumber));
	    // code block
		
	    break;
  default:
    // code block
}
 
  
  
 
	}

}
