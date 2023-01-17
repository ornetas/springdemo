package lt.ornetas.springdemo.service;

import lt.ornetas.springdemo.repository.CustomerRepository;
import lt.ornetas.springdemo.repository.ProductLineRepository;
import lt.ornetas.springdemo.repository.model.Customer;
import lt.ornetas.springdemo.repository.model.ProductLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLineService {

    @Autowired
    private ProductLineRepository productLineRepository;

    public List<ProductLine> getAllProductLines(){
        return (List<ProductLine>) productLineRepository.findAll();
    }

    public ProductLine getProductLineById(String productLineId){
        return productLineRepository.findById(productLineId).get();

    }
}
