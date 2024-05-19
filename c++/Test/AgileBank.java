package Test;

import org.testng.annotations.Test;
import java.net.HttpURLConnection;
import java.net.URL;

public class BackendConnectionTest {

    @Test
    public void testBackendConnection() {
        String backendUrl = "http://localhost:5000"; 
        try {
            URL url = new URL(backendUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            assert responseCode == 200 : "Backend connection failed with response code: " + responseCode;
        } catch (Exception e) {
            assert false : "Exception occurred while connecting to the backend: " + e.getMessage();
        }
    }
}