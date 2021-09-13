package org.atom.linx;

import com.google.gson.Gson;
import org.atom.linx.data.AccountNotification;

public class AccountNotificationManager {
    public static AccountNotification[] listGlobalNotifications(int account_id) {
        return new Gson().fromJson(APIManager.GET("/api/v1/accounts/" + account_id + "/account_notifications", new RequestMap()), AccountNotification[].class);
    }
    public static AccountNotification[] listGlobalNotifications(int account_id, boolean include_past) {
        RequestMap query = new RequestMap();
        query.put("include_past", include_past + "");
        return new Gson().fromJson(APIManager.GET("/api/v1/accounts/" + account_id + "/account_notifications", query), AccountNotification[].class);
    }
    public static AccountNotification getGlobalNotification(int account_id, int notification_id) {
        return new Gson().fromJson(APIManager.GET("/api/v1/accounts/" + account_id + "/account_notifications/" + notification_id, new RequestMap()), AccountNotification.class);
    }
    //TODO DELETE /api/v1/accounts/:account_id/account_notifications/:id
    //TODO POST /api/v1/accounts/:account_id/account_notifications
    //TODO PUT /api/v1/accounts/:account_id/account_notifications/:id
}