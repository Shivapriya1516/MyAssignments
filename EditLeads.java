package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CISCO");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sanvika");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SR");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sanu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kittypowder24@gmail.com");
	WebElement dropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select opt=new Select(dropDown);
	opt.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important fields");
	driver.findElement(By.name("submitButton")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
