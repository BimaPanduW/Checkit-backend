package hello.controllers;

import com.google.gson.Gson;
import hello.models.Bioskop;
import hello.models.KotaBioskop;
import hello.repositories.BioskopRepository;
import hello.repositories.KotaBioskopRepository;
import hello.utils.NetworkUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BioskopController {
    @Autowired
    private KotaBioskopRepository kotaBioskopRepository;

    @Autowired
    private BioskopRepository bioskopRepository;

    private NetworkUtil networkUtil = new NetworkUtil();

    @RequestMapping(method = RequestMethod.GET, value = "/kota")
    public List<KotaBioskop> getKota() {
        return (List<KotaBioskop>) kotaBioskopRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bioskop/{idKota}")
    public hello.DummyModels.Bioskop getBioskop(@PathVariable String idKota) {
        Bioskop bioskop = bioskopRepository.findByIdKota(idKota);
        Gson gson = new Gson();
        return gson.fromJson(bioskop.getResponJson(), hello.DummyModels.Bioskop.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reset-kota-bioskop")
    public void resetKotaBioskop() {
        networkUtil.setDaftarKotaBioskop(kotaBioskopRepository);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/kota-bioskop/{id}/{activated}")
    public void setKotaBioskop(@PathVariable String id, @PathVariable boolean activated) {
        KotaBioskop kotaBioskop = kotaBioskopRepository.findOne(id);
        kotaBioskop.setActivated(activated);
        kotaBioskopRepository.save(kotaBioskop);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/activated-kota-bioskop")
    public void setActiveKotaBioskop() {
        for (Bioskop bioskop : bioskopRepository.findAll()) {
            if(!bioskop.getResponJson().contains("error")) {
                KotaBioskop kotaBioskop = kotaBioskopRepository.findOne(bioskop.getIdKota());
                kotaBioskop.setActivated(true);
                kotaBioskopRepository.save(kotaBioskop);
            }
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/set-data-bioskop")
    public void setAllDataBioskop() {
        networkUtil.setAllBioskop(bioskopRepository, kotaBioskopRepository.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/set-all")
    public void setAll() {
        resetKotaBioskop();
        setAllDataBioskop();
        setActiveKotaBioskop();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String testOutput() {
        return "Hai Bima";
    }
}
