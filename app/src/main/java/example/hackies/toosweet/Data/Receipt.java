package example.hackies.toosweet.Data;

import java.util.List;

/**
 * Created by gabri on 27.01.2018.
 */

public class Receipt {
    // TODO: Should we change to private and use get / set instaed
    private String mDate;
    private String mTime;
    private String mStoreName;
    private String mTransactionNumber;
    List<ReceiptArticle> mReceiptArticles;

    public Receipt(String mDate, String mTime, String mStoreName, String mTransactionNumber, List<ReceiptArticle> mReceiptArticles) {
        this.mDate = mDate;
        this.mTime = mTime;
        this.mStoreName = mStoreName;
        this.mTransactionNumber = mTransactionNumber;
        this.mReceiptArticles = mReceiptArticles;
    }


    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmStoreName() {
        return mStoreName;
    }

    public void setmStoreName(String mStoreName) {
        this.mStoreName = mStoreName;
    }

    public String getmTransactionNumber() {
        return mTransactionNumber;
    }

    public void setmTransactionNumber(String mTransactionNumber) {
        this.mTransactionNumber = mTransactionNumber;
    }

    public List<ReceiptArticle> getmReceiptArticles() {
        return mReceiptArticles;
    }

    public void setmReceiptArticles(List<ReceiptArticle> mReceiptArticles) {
        this.mReceiptArticles = mReceiptArticles;
    }

    public float getAbsoluteSugarofReceipt(){
        float absoluteTotalSugar = 0;

        for (int i=0; i<mReceiptArticles.size(); i++) {
            absoluteTotalSugar += mReceiptArticles.get(i).getAbsoluteSugar();
        }
        return absoluteTotalSugar;



    }
}
