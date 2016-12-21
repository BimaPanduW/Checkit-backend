package hello.repositories;

import hello.models.Bioskop;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bimapw on 12/20/16.
 */
public interface BioskopRepository extends CrudRepository<Bioskop, Long> {

    Bioskop findByIdKota(String idKota);

}
