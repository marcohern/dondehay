package com.rocketteam.dondehay.models;

/**
 * Created by marcoh on 23/11/14.
 */
public class DrawerMenuModel {
    private String _sDisplayName;
    private String _sCode;

    public DrawerMenuModel(String displayName, String code) {
        _sDisplayName = displayName;
        _sCode = code;
    }

    public String getDisplayName() { return _sDisplayName; }
    public String getCode() { return _sCode; }
}