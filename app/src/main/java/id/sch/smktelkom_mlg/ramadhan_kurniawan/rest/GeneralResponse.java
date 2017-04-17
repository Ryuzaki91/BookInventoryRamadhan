package id.sch.smktelkom_mlg.ramadhan_kurniawan.rest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Earl Kurnia on 17/04/2017.
 */

public class GeneralResponse {
    @SerializedName("Result")
    private String result;
    @SerializedName("Message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
