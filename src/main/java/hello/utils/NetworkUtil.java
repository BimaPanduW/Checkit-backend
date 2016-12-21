package hello.utils;

import com.google.gson.Gson;
import hello.Application;
import hello.models.Bioskop;
import hello.models.KotaBioskop;
import hello.repositories.BioskopRepository;
import hello.repositories.KotaBioskopRepository;
import hello.responses.KotaBioskopResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

/**
 * Created by bimapw on 12/20/16.
 */
public class NetworkUtil {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public void setDaftarKotaBioskop(KotaBioskopRepository kotaBioskopRepository) {
        log.info("Memulai set daftar kota bioskop");
        try {
            URL url = new URL("http://ibacor.com/api/jadwal-bioskop?k="+MyConstans.IBACOR_API_KEY);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String strTemp = "";
            String json = "";
            while (null != (strTemp = br.readLine())) {
                json += strTemp;
            }

            Gson gson = new Gson();
            KotaBioskopResponse response = gson.fromJson(json, KotaBioskopResponse.class);

            for(KotaBioskop kotaBioskop : response.getData()) {
                log.warn("memasukkan data : "+kotaBioskop.toString());
                kotaBioskopRepository.save(kotaBioskop);
            }
            log.info("Selesai set daftar kota bioskop");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error set daftar kota bioskop : "+ex.getMessage());
        }
    }

    public void setBioskop(BioskopRepository bioskopRepository, String idKota) {
        log.info("Memulai set data bioskop dengan idKota : "+idKota);
        try {
            URL url = new URL("http://ibacor.com/api/jadwal-bioskop?id="+idKota+"&k="+MyConstans.IBACOR_API_KEY);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String strTemp = "";
            String json = "";
            while (null != (strTemp = br.readLine())) {
                json += strTemp;
            }
            log.warn(json);
            bioskopRepository.save(new Bioskop(idKota, json));
            log.info("Selesai set data bioskop");

        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error set data bioskop : "+ex.getMessage());
        }
    }

    public void setAllBioskop(BioskopRepository bioskopRepository, Iterable<KotaBioskop> kotaBioskopList) {
        log.info("memulai set semua data bioskop");
        for (KotaBioskop kotaBioskop : kotaBioskopList) {
            setBioskop(bioskopRepository, kotaBioskop.getId());
        }
        log.info("selesai set semua data bioskop");
    }

}
