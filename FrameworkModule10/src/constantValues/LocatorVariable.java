package constantValues;

public class LocatorVariable {
	
	public String LoginLocatorValue_SignIn = "linkText:Log In";
	public String UserNameLocatorValue_SignIn = "id:si_popup_email";
	public String PasswordLocatorValue_SignIn = "id:si_popup_passwd";
	public String LoginButtonLocatorValue_SignIn = "xpath://*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button";
	
	public String SearchBoxLocatorValue_Mycourse = "xpath://input[@placeholder='Search for a skill you wish to master']";
	public String CourseLinkLocValue_Mycourse = "xpath://span[contains(text(),'Web Development Certification Training')]";
	
	public String EnrollCourseLocValue_SelectCourse = "linkText:ENROLL NOW";
	
	public String ProceedToPaymentLocValue_Payment = "xpath://*[@id=\"osp_wrapper\"]/div/div[1]/div[3]/div[1]/div[2]/button";
	public String PaySecurelyLocValue_Payment = "xpath://*[@id=\"user_payment\"]/div/div/div[2]/div[1]/button";
	
	public String CancelLOcValue_Transaction = "xpath://div[@class='tabcontent OPTCRDC resp-tab-content resp-tab-content-active']//span[@class='primary-button-text'][contains(text(),'Cancel')]";
	
	public String CancelLocValue_Popup = "xpath://*[@id=\"buttons\"]/span/a[1]/span";
	

}
