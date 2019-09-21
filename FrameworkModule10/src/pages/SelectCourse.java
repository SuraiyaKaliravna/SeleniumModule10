package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class SelectCourse {
	
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	
	public void clickEnrollCourse() throws Exception {
		AK.scrolling();
		AK.explicitWait(LV.EnrollCourseLocValue_SelectCourse);
		AK.handlingClick(LV.EnrollCourseLocValue_SelectCourse);
	}
}
