import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		

			String my_url = "http://localhost:80";
			URL url = new URL(my_url);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			
		  
			System.out.println("Response Code: "+connection.getResponseCode());
			System.out.println("Content Length: "+connection.getContentLength());
			System.out.println("Content Type: "+connection.getContentType());
			System.out.println("Header Field Key : " +connection.getHeaderFieldKey(3));
			String S = connection.getHeaderFieldKey(3);
			System.out.println("Header Field : "+connection.getHeaderField(S));			
			
		}catch(Exception e){} 
	}

}
