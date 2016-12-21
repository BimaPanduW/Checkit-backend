package hello.models;

import javax.persistence.*;

/**
 * Created by bimapw on 12/20/16.
 */
@Entity
public class Bioskop {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String idKota;
    @Lob
    private String responJson;

    protected Bioskop() {
    }

    public Bioskop(String idKota, String responJson) {
        this.idKota = idKota;
        this.responJson = responJson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdKota() {
        return idKota;
    }

    public void setIdKota(String idKota) {
        this.idKota = idKota;
    }

    public String getResponJson() {
        return responJson;
    }

    public void setResponJson(String responJson) {
        this.responJson = responJson;
    }
}
