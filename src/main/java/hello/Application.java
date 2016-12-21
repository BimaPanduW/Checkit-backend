package hello;

import com.google.gson.Gson;
import hello.models.Bioskop;
import hello.models.Customer;
import hello.models.KotaBioskop;
import hello.repositories.BioskopRepository;
import hello.repositories.CustomerRepository;
import hello.repositories.KotaBioskopRepository;
import hello.responses.KotaBioskopResponse;
import hello.utils.MyConstans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by bimapw on 12/20/16.
 */

@SpringBootApplication
public class Application {

    @Autowired
    BioskopRepository bioskopRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
