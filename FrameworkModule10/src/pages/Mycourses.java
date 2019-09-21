package pages;

import constantValues.LocatorVariable;
import constantValues.TestData;
import utility.ActionKeyWords;

public class Mycourses {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	TestData TD = new TestData();
	
	public void clickSearchBar() throws Exception {
		Thread.sleep(5000);
		AK.handlingClick(LV.SearchBoxLocatorValue_Mycourse);
	}
	
	public void enterCourseName() {
		AK.handlingTextBox(LV.SearchBoxLocatorValue_Mycourse, TD.courseName);
	}
	
	public void selectCourseFromList() throws Exception {
		AK.explicitWait(LV.CourseLinkLocValue_Mycourse);
		AK.handlingClick(LV.CourseLinkLocValue_Mycourse);
	}
	
	public void switchWindow() {
		AK.switchMultipleWindows(1);
	}

}
