package co.davo.nashvilletourguide;

/**
 * Created by Davo on 10/1/2016.
 */

public class Location {
    private String mName;
    private String mDestription;
    private String mAddress;
    private int mImageResourceId;

    public Location(String mName, String mDestription, String mAddress, int mImageResourceId) {
        this.mName = mName;
        this.mDestription = mDestription;
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmDestription() {
        return mDestription;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
