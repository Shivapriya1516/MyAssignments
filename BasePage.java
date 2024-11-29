package week3.Day1;

public class BasePage {
public void findelement()
{
	System.out.println("2 elements");
}
public void clickelement()
{
	System.out.println("click elements");
}
public void entertext()
{
	System.out.println("hello");
}
public void performcommontask()
{
	System.out.println("close the window");
}
public static void main(String[] args) {
	

	BasePage bp=new BasePage();
	bp.findelement();
	bp.clickelement();
	bp.entertext();
	bp.performcommontask();
	
}
	
	 

}



//e findElement(), clickElement(), enterText() and performCommonTasks(). 