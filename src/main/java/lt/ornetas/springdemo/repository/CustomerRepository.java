package lt.ornetas.springdemo.repository;

import lt.ornetas.springdemo.repository.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Optional<Customer> findByCustomerNumber(int id);

    Optional<Customer> findByCustomerName(String customerName);

    Iterable<Customer> findByCustomerNameLike(String customerName);

    @Query(value = "SELECT * FROM customers WHERE customerName LIKE: name", nativeQuery = true)
    List<Customer> getCustomerNameLike (@Param("name") String customerName);




//    @Override
//    Optional<Customer> findById(Integer integer);
}
