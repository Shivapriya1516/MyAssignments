package week3.Day2;

public class JavaConnection extends MySqlConnection {
public static void main(String[] args) {
	JavaConnection jc=new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeupdate();
	jc.executeQuery();
}

public void connect() {
	System.out.println("connection is created");
	
}

@Override
public void disconnect() {
	System.out.println("Connection is disconnected");	
}

@Override
public void executeupdate() {
	System.out.println("Update is executed");
	
}

@Override
void executeQuery() {
	System.out.println("Query is executed");
	
}
}
