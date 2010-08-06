import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;

public class HttpClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String my_url = "http://poolws.marketsimplified.com/";
			URL url = new URL(my_url);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			
			connection.setRequestMethod("GET");
			connection.connect();

			BufferedReader reader;

			reader = new BufferedReader(new InputStreamReader(connection
					.getInputStream()));
			String line;
			line = reader.readLine();
			
			Pattern p = Pattern.compile("[|]");
			String [] result = p.split(line);
			System.out.println(line);
			
			for(int i = 0; i < result.length; i++)
				System.out.println(result[i]);
			


			
		} catch (Exception e) {
		}
	}
}
