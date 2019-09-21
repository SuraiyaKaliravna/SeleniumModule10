package testCase;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.Payment;
import pages.SelectCourse;

public class TC004 {
	SelectCourse SC = new SelectCourse();
	Payment PY = new Payment();
	
	public void tc04() {
		try {
			SC.clickEnrollCourse();
			PY.clickProceedPayment();
			PY.clickSecurePaymentLink();
		}
		catch(Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}

}
