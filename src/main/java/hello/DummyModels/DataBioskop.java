
package hello.DummyModels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBioskop {

    private String movie;
    private String poster;
    private String genre;
    private String duration;
    private List<JadwalBioskop> jadwal = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<JadwalBioskop> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<JadwalBioskop> jadwal) {
        this.jadwal = jadwal;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
