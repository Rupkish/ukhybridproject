package script;


	

	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.annotations.Test;

	import generic.BaseTest;
	import generic.XL;
	import pom.EnterTimeTrackPage;
	import pom.LoginPage;

	public class ValidLogin extends BaseTest {
	 
	 @Test(priority=1)
	 public void testvalidLogin() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
	  String un=XL.getData(XL_PATH, "ValidLogin", 1, 0);//invalid-1
	  String pw=XL.getData(XL_PATH, "ValidLogin", 1, 1);
	  String title=XL.getData(XL_PATH, "ValidLogin", 1, 2);
	  
	  //Enter valid username
	  LoginPage l=new LoginPage(driver);
	  l.setUserName(un);
	  
	  //Enter valid password
	  l.setPassword(pw);
	  
	  //click on login button
	  l.clickLogi();
	  
	  //verify home page is displayed
	  EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	  e.verifyHomePageIsDisplayed(driver, ETIME, title);
	 }

	}



