package lt.ornetas.springdemo.controller;

import lt.ornetas.springdemo.repository.model.Customer;
import lt.ornetas.springdemo.repository.model.ProductLine;
import lt.ornetas.springdemo.service.CustomerService;
import lt.ornetas.springdemo.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping (path = "/productlinetemplate")
public class ProductLineTemplateController {

    @Autowired
    private ProductLineService productLineService;

    // http://localhost:8080/productlinetemplate/test
    @GetMapping(path = "/test")
    public String getTestPage() {

        return "/test/test_page";
    }

    // http://localhost:8080/productlinetemplate/firstpage/productline/ships
    @GetMapping(path = "/firstpage/productline/{id}")
    public String getProductLineInFirstPage(Model model, @PathVariable String id) {

        ProductLine productLine = productLineService.getProductLineById(id);
        model.addAttribute("product_line", productLine.getProductLine());
        model.addAttribute("text_description", productLine.getTextDescription());
        model.addAttribute("html_description", productLine.getHtmlDescription());

        return "/test/firstpage_productline";
    }

    // http://localhost:8080/productlinetemplate/firstpage/productline/all
    @GetMapping(path = "/firstpage/productline/all")
    public String getAllProductLines(Model model){
        List<ProductLine> productLineList = productLineService.getAllProductLines();
        model.addAttribute("key_productline_list", productLineList);
        return "test/firstpage_productline_list";
    }

}
