package id.sch.smktelkom_mlg.ramadhan_kurniawan.rest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Earl Kurnia on 17/04/2017.
 */

public class InsertBookResponse {
    @SerializedName("Result")
    private String result;
    @SerializedName("id_buku")
    private int id_buku;
    @SerializedName("Message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
