package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// To launch application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//to locate the element
		/*
		 * WebElement userName = driver.findElementById("username"); 
		 * to type a
		 * value in text field userName.sendKeys("DenoSalesManager");
		 */		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// to locate the password element
		WebElement password = driver.findElementByName("PASSWORD");
		password.sendKeys("crmsfa");
		
		// to locate and click the button
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Manikandan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajendran");
		driver.findElementByName("submitButton").click();
	}

}
