package Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetReponseCode {
	public static int getResponse(String testurl) throws IOException {
		URL url = new URL(testurl.trim());
		System.out.println("Trimmed URL = "+url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		return con.getResponseCode();
	}
}
