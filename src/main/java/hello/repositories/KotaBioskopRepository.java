package hello.repositories;

import hello.models.KotaBioskop;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bimapw on 12/20/16.
 */
public interface KotaBioskopRepository extends CrudRepository<KotaBioskop, String> {
    List<KotaBioskop> findByActivatedTrue();
}
