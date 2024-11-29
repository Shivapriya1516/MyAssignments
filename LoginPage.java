package week3.Day1;

public class LoginPage extends BasePage{
public void performcommontask()
{
	System.out.println("View dashboard");
}
public static void main(String[] args) {
	LoginPage lp =new LoginPage();
	lp.performcommontask();
	lp.clickelement();
	lp.entertext();
	lp.findelement();
}
}
