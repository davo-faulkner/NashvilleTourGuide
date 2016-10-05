package co.davo.nashvilletourguide;

/**
 * Created by Davo on 10/1/2016.
 */

public class Location {
    private int mNameResourceId;
    private String mDescription;
    private String mAddress;
    private int mImageResourceId;

    public Location(int mNameResourceId, String mDescription, String mAddress, int mImageResourceId) {
        this.mNameResourceId = mNameResourceId;
        this.mDescription = mDescription;
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmNameResourceId() {
        return mNameResourceId;
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
