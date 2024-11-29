package week3.Day1;

public class LoginTestData extends TestData{
public void enterUsername() {
System.out.println("Shivapriya");}
public void enterPassword()
{
	System.out.println("************");
}
public static void main(String[] args) {
	LoginTestData lo=new LoginTestData();
	lo.enterCredentials();
	lo.navigateToHomePage();
	lo.enterUsername();
	lo.enterPassword();
}
}
