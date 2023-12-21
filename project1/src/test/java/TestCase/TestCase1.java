package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import page.TestCasePage;



public class TestCase1 {
	
	
	
	@Test
	public void LaunchingTheUrl() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TestCasePage tc=new TestCasePage(driver);
		tc.Enter_The_values();
		driver.close();
	}

}
