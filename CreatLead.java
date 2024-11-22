package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Servion");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shivapriya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("FirstLead");
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(5000);
	driver.close();
}
}
