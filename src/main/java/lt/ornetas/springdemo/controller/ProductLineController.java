package lt.ornetas.springdemo.controller;

import lt.ornetas.springdemo.repository.model.ProductLine;
import lt.ornetas.springdemo.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/productlinemapping")

public class ProductLineController {

    @Autowired
    private ProductLineService productLineService;

    // http://localhost:8080/productlinemapping/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestPage() {
        return "This is some test from SPRING!";
    }

    // http://localhost:8080/productlinemapping/productline/all
    @GetMapping(path = "/productline/all")
    public @ResponseBody List<ProductLine> getAllProductLines() {
        return productLineService.getAllProductLines();
    }

    // http://localhost:8080/productlinemapping/productline/trains
    @GetMapping(path = "/productline/{id}")
    public @ResponseBody ProductLine getProductLineById(@PathVariable String id){
        return productLineService.getProductLineById(id);
    }

}
