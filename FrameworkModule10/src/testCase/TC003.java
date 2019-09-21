package testCase;

import org.testng.Reporter;

import driverScript.MainScript;
import pages.Mycourses;

public class TC003 {
	Mycourses MC = new Mycourses();

	public void tc03() {
		try {
			MC.clickSearchBar();
			MC.enterCourseName();
			MC.selectCourseFromList();
			MC.switchWindow();
		}
		catch(Exception e) {
			MainScript.bValue = false;
			Reporter.log("Test Case tc01 has failed");
			e.printStackTrace();
		}
	}
}
