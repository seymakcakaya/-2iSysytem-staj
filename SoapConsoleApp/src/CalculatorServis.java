import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.CalculatorLocator;
import org.tempuri.CalculatorSoapStub;

public class CalculatorServis {
	CalculatorLocator locator ;
	CalculatorSoapStub stub;
	public CalculatorServis() throws MalformedURLException, Exception{
		URL url = new URL("http://www.dneonline.com/calculator.asmx?WSDL");
		 locator = new CalculatorLocator();
		 stub = (CalculatorSoapStub) locator.getCalculatorSoap(url);
		
	}
	public  float addition( int number1, int number2) throws RemoteException {
	
		return stub.add(number1,number2 );
		
	}
	public  float subtraction( int number1, int number2) throws RemoteException{
		return stub.subtract(number1,number2 );
	}
	public  float 	division( int number1, int number2)throws RemoteException {
		return stub.divide(number1,number2 );
	}
	public  float multiplication( int number1, int number2)throws RemoteException {
		return stub.multiply(number1,number2 );
	}
			
	
}
