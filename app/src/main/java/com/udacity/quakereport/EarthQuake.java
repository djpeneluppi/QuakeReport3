package com.udacity.quakereport;

public class EarthQuake {
    // magnitude of the earthquake
    private double mMagnitude;
    private String mRegion;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    //New
    private String mUrl;

    /**
     * Constructs a new {@link EarthQuake} object
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public EarthQuake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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

    public long getmTimeInMilliseconds() {return mTimeInMilliseconds; }

    public String getmUrl() { return mUrl;}
}
