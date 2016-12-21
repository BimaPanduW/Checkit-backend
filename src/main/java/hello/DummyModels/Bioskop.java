
package hello.DummyModels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bioskop {

    private String status;
    private String kota;
    private String date;
    private List<DataBioskop> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DataBioskop> getData() {
        return data;
    }

    public void setData(List<DataBioskop> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
