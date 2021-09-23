package org.atom.linx;
import java.io.*;import java.net.HttpURLConnection;import java.net.URL;import java.util.HashMap;import java.util.Map;import java.util.Scanner;
public class APIManager {
    protected static String apiKey;
    protected static String domain;

    public static String getApiKey() {
        return apiKey;
    }

    public static void setApiKey(String apiKey) {
        APIManager.apiKey = apiKey;
    }

    public static String getDomain() {
        return domain;
    }

    public static void setDomain(String domain) {
        APIManager.domain = domain;
    }

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