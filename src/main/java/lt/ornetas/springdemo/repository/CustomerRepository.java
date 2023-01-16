package lt.ornetas.springdemo.repository;

import lt.ornetas.springdemo.repository.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
