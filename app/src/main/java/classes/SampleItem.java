package classes;

//this the custom object
//will be used to fill the recyclerView

public class SampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public SampleItem(int ImageResource, String text1, String text2) {
        this.mImageResource = ImageResource;
        this.mText1 = text1;
        this.mText2 = text2;
    }

    //to get back the values use getters
    public int getmImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return mText2;
    }


}
