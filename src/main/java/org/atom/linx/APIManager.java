package org.atom.linx;
import java.io.*;import java.net.HttpURLConnection;import java.net.URL;import java.util.HashMap;import java.util.Map;import java.util.Scanner;
public class APIManager {
    public static String apiKey = "7570~jASS1xRgyY56FF2POaQKBnVakkJEaIcjYTD4fXRglpYZACcZXuygafBuiNPNBvyb";
    public static String domain = "boone";

    public static String GET(String shortenedURL, HashMap<String, String> args) {
        try {
            String s = "https://" + APIManager.domain + ".instructure.com" + shortenedURL + "?";
            for (Map.Entry<String, String> e : args.entrySet()) {
                s += e.getKey() + "=" + e.getValue().replace(' ', '+') + "&";
            }
            URL url = new URL(s);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if (conn.getResponseCode() == 200) {
                InputStream is = (InputStream) conn.getInputStream();
                String result = "";
                try (Scanner scan = new Scanner(is)) {
                    result += scan.useDelimiter("\\A").next();
                }
                return result;
            } else {
                return null;
            }
        } catch (IOException e) {
            System.err.println("Error when opening connection!");
            e.printStackTrace();
            return null;
        }
    }
}