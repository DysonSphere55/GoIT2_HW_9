package goit;

import java.io.IOException;
import java.net.*;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws URISyntaxException, IOException, NoImageFound {
        String urlAddress = "https://http.cat/" + code + ".jpg";

        URI uri = new URI(urlAddress);
        URL url = uri.toURL();

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestMethod("GET");

        int responseCode = urlConnection.getResponseCode();

        if (responseCode == 404) {
            throw new NoImageFound();
        } else {
            return urlAddress;
        }
    }
}
