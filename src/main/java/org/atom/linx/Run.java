package org.atom.linx;
import org.atom.linx.data.AccountDomain;

public class Run {
    public static void main(String[] args) {
        RequestMap query = new RequestMap();
        query.put("name", "university of kentucky");
        for (AccountDomain ad : AccountDomainLookupsManager.searchAccountDomains(query)) {
            System.out.println(ad.getName() + " | " + ad.getDomain());
        }
    }
}
