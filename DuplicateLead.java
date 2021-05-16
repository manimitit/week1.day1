package week2.day1.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// Enter UserName and Password Using Id Locator
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password = driver.findElementByName("PASSWORD");
		password.sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElementByClassName("decorativeSubmit").click();

		// Get the Title and verify it
		System.out.println("The title of the page is " + driver.getTitle());

		// Click on CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads Button
		driver.findElementByLinkText("Leads").click();

		// Click on Create Lead Button
		driver.findElementByLinkText("Create Lead").click();

		// Fill all the fields Except Parent Account (Note : Enter Date in Date of Birth
		// field by using sendKeys)
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Manikandan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajendran");

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown1 = new Select(source);
		dropDown1.selectByValue("LEAD_DIRECTMAIL");

		WebElement marketingCompaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown2 = new Select(marketingCompaign);
		dropDown2.selectByValue("DEMO_MKTG_CAMP");

		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Mani");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Raj");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("xyz");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("abc");
		driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000000");

		WebElement preferredCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown3 = new Select(preferredCurrency);
		dropDown3.selectByValue("AMD");

		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown4 = new Select(industry);
		dropDown4.selectByValue("IND_HEALTH_CARE");

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown5 = new Select(ownership);
		dropDown5.selectByValue("OWN_PARTNERSHIP");

		// Click on create Lead Button
		driver.findElementByName("submitButton").click();

		// Click on Duplicate Lead button
		driver.findElementByLinkText("Duplicate Lead").click();

		// Clear the Existing Company name And Enter the New Company name
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");

		// Click on the Create Lead button
		driver.findElementByLinkText("Create Lead").click();

		// wait for 10 seconds
		Thread.sleep(10000);

		// close the browser
		driver.close();		
	}

}
