package org.atom.linx;
import java.util.HashMap;
public class RequestMap extends HashMap<String, String> {
    public RequestMap() {
        this.put("access_token", APIManager.apiKey);    }
}
