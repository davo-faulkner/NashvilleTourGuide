package co.davo.nashvilletourguide;

/**
 * Created by Davo on 10/1/2016.
 */

public class Location {
    private int mNameResourceId;
    private int mDescriptionResourceId;
    private int mAddressResourceId;
    private int mImageResourceId;

    public Location(int mNameResourceId, int mDescriptionResourceId, int mAddressResourceId, int mImageResourceId) {
        this.mNameResourceId = mNameResourceId;
        this.mDescriptionResourceId = mDescriptionResourceId;
        this.mAddressResourceId = mAddressResourceId;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmNameResourceId() {
        return mNameResourceId;
    }

    public int getmDescriptionResourceId() {
        return mDescriptionResourceId;
    }

    public int getmAddressResourceId() {
        return mAddressResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
