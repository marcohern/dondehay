package com.rocketteam.dondehay.models;

/**
 * Created by marcoh on 23/11/14.
 */
public class Place {
    private String _mName;
    private String _mCategory;
    private String _mAddress;
    private double _mLat, _mLng;

    public Place(String name, String category, String address, double lat, double lng) {
        _mName=name;
        _mCategory=category;
        _mAddress=address;
        _mLat=lat;
        _mLng=lng;
    }

    public String getName() {
        return _mName;
    }
    public String getCategory() { return _mCategory; }
    public String getAddress() {
        return _mAddress;
    }
    public double getLat() {
        return _mLat;
    }
    public double getLng() {
        return _mLng;
    }

    public void setName(String name) {
        _mName = name;
    }
    public void setCategory(String category) {
        _mCategory = category;
    }
    public void setAddress(String address) {
        _mAddress = address;
    }
    public void setLat(double lat) {
        _mLat = lat;
    }
    public void setLng(double lng) {
        _mLng = lng;
    }

}
