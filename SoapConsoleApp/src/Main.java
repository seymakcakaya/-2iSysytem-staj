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
 System.out.println("��lem Yapmak �stedi�iniz Say�lar� Yaz�n�z:");
 System.out.print("Birinci sayi:");
 firstNumber=scanner.nextInt();
 System.out.print("�kinci sayi sayi:");
 secondNumber=scanner.nextInt();
 System.out.println("��lem T�r�n� belirleyiniz:");
 System.out.println("Toplama i�lemi i�in 1");
 System.out.println("��karma i�lemi i�in 2");
 System.out.println("B�lme  i�lemi i�in 3");
 System.out.println("�arpma i�lemi i�in 4 ");
 System.out.println("Yapmak istedi�iniz i�lem:");
 int secim= scanner.nextInt();
 System.out.println("��lem ve sonucu:");

  
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
