
package hello.DummyModels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JadwalBioskop {

    private String bioskop;
    private List<String> jam = null;
    private String harga;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBioskop() {
        return bioskop;
    }

    public void setBioskop(String bioskop) {
        this.bioskop = bioskop;
    }

    public List<String> getJam() {
        return jam;
    }

    public void setJam(List<String> jam) {
        this.jam = jam;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
