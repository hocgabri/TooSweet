package example.hackies.toosweet.Data;

/**
 * Created by gabri on 27.01.2018.
 */

public class Article {
    private String mName;
    private int mBarCode;
    private int mQuantity;
    private int msugar_per_hundert;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmBarCode() {
        return mBarCode;
    }

    public void setmBarCode(int mBarCode) {
        this.mBarCode = mBarCode;
    }

    public int getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(int mQuantity) {
        this.mQuantity = mQuantity;
    }

    public int getMsugar_per_hundert() {
        return msugar_per_hundert;
    }

    public void setMsugar_per_hundert(int msugar_per_hundert) {
        this.msugar_per_hundert = msugar_per_hundert;
    }
}
