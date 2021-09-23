package org.atom.linx;

import com.google.gson.Gson;
import org.atom.linx.data.AccountDomain;

public class AccountDomainLookupsManager {
    public static AccountDomain[] searchAccountDomains(SearchQuery query) {
        return new Gson().fromJson(APIManager.GET("/api/v1/accounts/search", query), AccountDomain[].class);
    }
}