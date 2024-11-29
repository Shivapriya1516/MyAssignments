package week3.Day2;

public interface DatabaseConnction {
public void connect();
static void disconnect() {
	System.out.println("database is disconnected");
}
}
