package hello.responses;

import hello.models.KotaBioskop;

import java.util.List;

/**
 * Created by bimapw on 12/13/16.
 */
public class KotaBioskopResponse {
    private String status;
    private List<KotaBioskop> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<KotaBioskop> getData() {
        return data;
    }

    public void setData(List<KotaBioskop> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "KotaBioskopResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
