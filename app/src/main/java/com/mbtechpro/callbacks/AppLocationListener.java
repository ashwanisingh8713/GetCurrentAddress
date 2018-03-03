package com.mbtechpro.callbacks;

/**
 * Created by ashwanisingh on 02/03/18.
 */

public interface AppLocationListener {

    void locationReceived(String maxAddress, String pin, String state, String city, String subCity, String countryCode);
    void locationFailed();
}
