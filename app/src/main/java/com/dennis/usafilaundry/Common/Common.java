package com.dennis.usafilaundry.Common;

import android.location.Location;

import com.dennis.usafilaundry.Model.User;
import com.dennis.usafilaundry.Remote.FCMClient;
import com.dennis.usafilaundry.Remote.IFCMService;
import com.dennis.usafilaundry.Remote.IGoogleAPI;
import com.dennis.usafilaundry.Remote.RetrofitClient;


public class Common {

    public static String currentToken = "";

    public static final String laundry_tbl = "Laundrys";
    public static final String user_laundry_tbl = "LaundryInformation";
    public static final String user_customer_tbl = "CustomersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;
    public static User currentUser;


    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IGoogleAPI getGoogleAPI(){
        return  RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);

    }

}
