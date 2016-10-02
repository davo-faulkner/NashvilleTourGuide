package co.davo.nashvilletourguide;

/**
 * Created by Davo on 10/1/2016.
 */

public class Location {
    private String mName;
    private String mDescription;
    private String mAddress;
    private int mImageResourceId;

    public Location(String mName, String mDescription, String mAddress, int mImageResourceId) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
