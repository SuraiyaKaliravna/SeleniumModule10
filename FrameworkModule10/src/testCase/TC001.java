package testCase;


import org.testng.Reporter;

import constantValues.TestData;
import driverScript.MainScript;
import utility.ActionKeyWords;

public class TC001 {
	ActionKeyWords AK = new ActionKeyWords();
	TestData TD = new TestData();
	
	public void tc01() {
		try {
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.openURL);
		}
		catch(Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}

}
