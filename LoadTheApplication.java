package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadTheApplication {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//Load the application (http://leaftaps.com/opentaps/control/main)
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximize the browser
		driver.manage().window().maximize();
		
		//wait for 10 seconds
		Thread.sleep(10000);
		
		//close the browser
		driver.close();
	}

}
