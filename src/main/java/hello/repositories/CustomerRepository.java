package hello.repositories;

import hello.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bimapw on 12/20/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
