package com.example.xyzreader.remote;

import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
       // "https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json"
        //"https://go.udacity.com/xyz-reader-json"
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (Exception ex) {
            // TODO: throw a real error
           // Log.e(TAG, "Please check your internet connection.");
            ex.printStackTrace();
        }

        BASE_URL = url;
    }
}
