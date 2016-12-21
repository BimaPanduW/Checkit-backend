package hello.controllers;

import hello.repositories.CustomerRepository;
import hello.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bimapw on 12/20/16.
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public List<Customer> getCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
}
