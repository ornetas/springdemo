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

    public Customer getCustomerById(Integer customerId){
        return customerRepository.findById(customerId).get();

    }
    public Customer getMyCustomerById(int id){
        return customerRepository.findByCustomerNumber(id).get();
    }
    public Customer getMyCustomerByName(String customerName){
        return customerRepository.findByCustomerName(customerName).get();
    }
    public List<Customer> getMyCustomerByNameLike(String customerName){
        return (List<Customer>) customerRepository.findByCustomerNameLike(customerName);
    }
    public List<Customer> getQueryCustomerByNameLike(String customerName){
        return (List<Customer>) customerRepository.findByCustomerNameLike(customerName);
    }



}
