package org.atom.linx;
import java.util.HashMap;
public class SearchQuery extends HashMap<String, String> {
    { put("access_token", APIManager.apiKey); }
}
