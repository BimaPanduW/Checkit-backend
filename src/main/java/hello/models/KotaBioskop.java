package hello.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bimapw on 12/13/16.
 */
@Entity
public class KotaBioskop {
    @Id
    private String id;

    private String kota;

    private boolean activated;

    protected KotaBioskop() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "KotaBioskop{" +
                "id='" + id + '\'' +
                ", kota='" + kota + '\'' +
                ", activated=" + activated +
                '}';
    }
}
