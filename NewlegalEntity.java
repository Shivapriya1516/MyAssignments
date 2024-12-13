package week5.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewlegalEntity extends SaleforceAnnotaions {
	@Test
	public void runEntity(){
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement js=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions obj=new Actions(driver);
		
		obj.scrollToElement(js).perform();
		driver.executeScript("arguments[0].click();", js);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Shivapriya");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	}

}

