package org.atom.linx;

import com.google.gson.Gson;
import org.atom.linx.data.Scope;

public class TokenScopesManager {
    public static Scope[] listScopes(int account_id) {
        return new Gson().fromJson(APIManager.GET("/api/v1/accounts/" + account_id + "/scopes", new RequestMap()), Scope[].class);
    }
}
