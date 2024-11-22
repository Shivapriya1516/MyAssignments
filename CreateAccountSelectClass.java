package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
//driver.findElement(By.className("selected")).click();
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
driver.findElement(By.id("accountName")).sendKeys("Demo");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
WebElement dropDown1 =driver.findElement(By.name("industryEnumId"));
Select opt1=new Select(dropDown1);
opt1.selectByVisibleText("Computer Software");
WebElement dropDown2=driver.findElement(By.name("ownershipEnumId"));
Select opt2=new Select(dropDown2);
opt2.selectByVisibleText("S-Corporation");
WebElement dropDown3=driver.findElement(By.id("dataSourceId"));
Select opt3=new Select(dropDown3);
opt3.selectByValue("LEAD_EMPLOYEE");
WebElement dropDown4=driver.findElement(By.id("marketingCampaignId"));
Select opt4=new Select(dropDown4);
opt4.selectByIndex(5);
WebElement dropDown5=driver.findElement(By.id("generalStateProvinceGeoId"));
Select opt5=new Select(dropDown5);
opt5.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
if(text.contains("Demo"));
{
	System.out.println("created successfully");
}
driver.close();



}
}
