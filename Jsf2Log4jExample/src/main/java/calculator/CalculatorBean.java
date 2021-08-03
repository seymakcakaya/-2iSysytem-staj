package calculator;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean
@SessionScoped
public class CalculatorBean implements Serializable {

	
	private static final long serialVersionUID = 1L;	
	private static Logger logger = Logger.getLogger(CalculatorBean.class);
	 ICalculator calculator;
	    private float number1;
	    public float getNumber1() {
			return number1;
		}
	    
	    
public CalculatorBean() {
	calculator=new CalculatorManager();
}
		public void setNumber1(float number1) {
			this.number1 = number1;
		}

		public float getNumber2() {
			return number2;
		}

		public void setNumber2(float number2) {
			this.number2 = number2;
		}

		private float number2;
	    private float result;

	    

	    public float getResult() {
	        return result;
	    }

	    public void setResult(float result) {
	        this.result = result;
	    }

	    public void addition() {
	    	
	    	
	        result = calculator.addition(number1, number2);
	        logger.info("Toplama iþlemi yapýldý.Yapýlan iþlem: " + number1+" + "+number2+" = " + result);

	    }

	    public void subtraction() {
	        result = calculator.subtraction(number1, number2);
	        logger.info("Çýkarma iþlemi yapýldý.Yapýlan iþlem: " + number1+" - "+number2+" = " + result);
	       
	    }

	    public void division() {
	    	try {
	    		 result = calculator.division(number1, number2);
	 	        logger.info("Bölme iþlemi yapýldý.Yapýlan iþlem: " + number1+" / "+number2+" = " + result);
	 	       
			} catch (Exception e) {
	
				System.out.print(e.getMessage());
			        logger.error(" Hata:"+ e.getMessage()+"Yapýlan iþlem: " + number1+" / "+number2+" = " + result);
			       
			}
	       
	    }

	    public void multiplication() {
	        result = calculator.multiplication(number1, number2);
	        logger.info("Çarpma iþlemi yapýldý.Yapýlan iþlem: " + number1+" * "+number2+" = " + result);
	       
	    }
}
