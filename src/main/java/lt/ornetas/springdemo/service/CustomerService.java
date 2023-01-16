package lt.ornetas.springdemo.service;

import lt.ornetas.springdemo.repository.CustomerRepository;
import lt.ornetas.springdemo.repository.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
}
