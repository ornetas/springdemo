package lt.ornetas.springdemo.repository;

import lt.ornetas.springdemo.repository.model.ProductLine;
import org.springframework.data.repository.CrudRepository;

public interface ProductLineRepository extends CrudRepository<ProductLine, String> {
}
