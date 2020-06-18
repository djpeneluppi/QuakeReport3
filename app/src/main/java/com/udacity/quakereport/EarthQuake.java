package com.udacity.quakereport;

public class EarthQuake {
    private double mMagnitude;
    private String mRegion;
    private String mLocation;
    private String mDate;
    private String mTime;
    //New
    private String mUrl;

    public EarthQuake(double magnitude, String region, String location, String date,
                      String time, String url) {
        mMagnitude = magnitude;
        mRegion = region;
        mLocation = location;
        mDate = date;
        mTime = time;
        //New
        mUrl = url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmRegion() {
        return mRegion;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmTime() {
        return mTime;
    }

    //New
    public String getmUrl() { return mUrl;}
}
