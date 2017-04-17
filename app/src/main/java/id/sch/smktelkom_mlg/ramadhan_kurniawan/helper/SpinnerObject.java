package id.sch.smktelkom_mlg.ramadhan_kurniawan.helper;

/**
 * Created by Earl Kurnia on 17/04/2017.
 */


public class SpinnerObject {
    private int id;
    private String name;

    public SpinnerObject(int paramId, String paramName) {
        this.id = paramId;
        this.name = paramName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}
