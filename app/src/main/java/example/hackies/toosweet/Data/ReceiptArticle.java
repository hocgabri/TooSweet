package example.hackies.toosweet.Data;

/**
 * Created by gabri on 27.01.2018.
 */

public class ReceiptArticle {
    private String mRawName;

    public String getmRawName() {
        return mRawName;
    }

    public void setmRawName(String mRawName) {
        this.mRawName = mRawName;
    }

    public double getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(double mQuantity) {
        this.mQuantity = mQuantity;
    }

    private double mQuantity; // Amount of this product, (i.e. kg for fruits, int for products)
}
