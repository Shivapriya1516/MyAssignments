package week5.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SaleforceAnnotaions {
	public ChromeDriver driver ;
	
	@BeforeMethod
	public void precondition() {
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		options.addArguments("--disable-notifications");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
}
