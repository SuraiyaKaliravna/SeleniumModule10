package testCase;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.Transaction;
import utility.ActionKeyWords;

public class TC005 {

	Transaction TC = new Transaction();
	ActionKeyWords AK = new ActionKeyWords();
	
	public void tc05() {
		try {
			TC.clickCancelButton();
			TC.clickCancelonPopUp();
			AK.closeWindow();
			AK.quitBrowser();
		}
		catch(Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}
}
