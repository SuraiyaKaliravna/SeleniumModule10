package testCase;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.SignIn;

public class TC002 {
	SignIn SI = new SignIn();
	
	public void tc02() {
		try {
			SI.clickSignInLink();
			SI.enterUsername();
			SI.enterPassword();
			SI.clickSignInButton();
		}
		catch(Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}
}
