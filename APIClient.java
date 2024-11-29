package week3.Day1;

public class APIClient {
public void sendRequest(String endpoint) //passing variables
{
	System.out.println("Endpoint:" + endpoint);
}
public void sendRequest(String endpoint, String requestbody, boolean requeststatus) //passing variables
{
	System.out.println("Endpoint:" + endpoint + "\n" + "Requestbody:" + requestbody + "\n" + "RequestStatus:" + requeststatus);
	
}
public static void main(String[] args) {
	APIClient api=new APIClient();
	api.sendRequest("pagedown"); //passing variable values
	api.sendRequest("Pagedown", "Hello everyone", true); //passing variable values
}
}
