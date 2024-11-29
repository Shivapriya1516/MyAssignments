package week3.Day2;

public class FrontEnd extends APIConnection{
public static void main(String[] args) {
	FrontEnd fe=new FrontEnd();
	fe.connect();
	fe.executeupdate();	
}

@Override
public void connect() {
	System.out.println("database is connected");
	
}

@Override
void executeupdate() {
	System.out.println("execution is updated");
	
}
}
