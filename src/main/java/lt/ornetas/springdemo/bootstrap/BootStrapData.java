package lt.ornetas.springdemo.bootstrap;

import lt.ornetas.springdemo.repository.CustomerRepository;
import lt.ornetas.springdemo.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class BootStrapData implements CommandLineRunner {

   @Autowired
   private CustomerRepository customerRepository;
   @Autowired
   private ProductLineRepository productLineRepository;

    @Override
    public void run(String... args) throws Exception {

        customerRepository.findAll().forEach(System.out::println);
        System.out.println("\n===============================\n");
        System.out.println(customerRepository.findById(112));
        System.out.println("\n------------------------------------\n");
        productLineRepository.findAll().forEach(System.out::println);
        System.out.println("\n===============================\n");
        System.out.println(productLineRepository.findById("Ships"));

    }
}
