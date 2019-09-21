package pages;

import constantValues.LocatorVariable;
import utility.ActionKeyWords;

public class Payment {
	
	ActionKeyWords AK = new ActionKeyWords();
	LocatorVariable LV = new LocatorVariable();
	
	public void clickProceedPayment() throws Exception {
		AK.explicitWait(LV.ProceedToPaymentLocValue_Payment);
		AK.handlingClick(LV.ProceedToPaymentLocValue_Payment);
	}
	
	public void clickSecurePaymentLink() {
		AK.handlingClick(LV.PaySecurelyLocValue_Payment);
	}

}
