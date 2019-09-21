package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class Transaction {
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	
	public void clickCancelButton() {
		AK.handlingClick(LV.CancelLOcValue_Transaction);
	}
	
	public void clickCancelonPopUp() {
		AK.handlingClick(LV.CancelLocValue_Popup);
	}
}
