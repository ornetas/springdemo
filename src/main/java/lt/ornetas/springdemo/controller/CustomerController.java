package lt.ornetas.springdemo.controller;

import lt.ornetas.springdemo.repository.model.Customer;
import lt.ornetas.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/customermapping") //localhost:8080/customermapping
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    // https://localhost:8080/customermapping/test
    @GetMapping( path = "/test" )
    public @ResponseBody String getTestPage(){
        return "This is some test from SPRING!";
    }
    // http://localhost:8080/customermapping/customer/all
    @GetMapping( path = "/customer/all" )
    public @ResponseBody List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();


    }


}
