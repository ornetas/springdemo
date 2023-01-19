package lt.ornetas.springdemo.controller;

import lt.ornetas.springdemo.repository.model.Customer;
import lt.ornetas.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/customertemplate")
public class CustomerTemplateController {
    @Autowired
    private CustomerService customerService;

    // http://localhost:8080/customertemplate/test
    @GetMapping(path = "/test")
    public String getTestPage() {

        return "/test/test_page";
    }

    // http://localhost:8080/customertemplate/firstpage/customer/112
    @GetMapping(path = "/firstpage/customer/{id}")
    public String getCustomerInFirstPage(Model model, @PathVariable int id) {

       Customer customer = customerService.getMyCustomerById(id);
       model.addAttribute("company_name", customer.getCustomerName());
       model.addAttribute("contact_last_name", customer.getContactLastName());
       model.addAttribute("contact_first_name", customer.getContactFirstName());
       model.addAttribute("country", customer.getCountry());

        return "/test/firstpage";
    }

    // http://localhost:8080/customertemplate/firstpage/customer/all
    @GetMapping(path = "/firstpage/customer/all")
    public String getAllCustomers(Model model){
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("key_customers_list", customerList);
        return "test/firstpage_customer_list";
    }


    //JQuery set up

    // http://localhost:8080/customertemplate/customers/jquery
    @GetMapping(path = "/customers/jquery")
    public String gertJquerypage(){
        return "/test/jquerypage";
    }

    // http://localhost:8080/customertemplate/customers/like/a
    @GetMapping(path = "/customers/like/{name}")
    public @ResponseBody List<Customer> getMyCustomerByNameLike(@PathVariable String name){ // test
        return  customerService.getMyCustomerByNameLike("%" + name + "%"); // %test%
    }

    //JQuery set up


    // http://localhost:8080/customertemplate/customer/112
    @GetMapping(path = "/customer/{id}")
    public String getCustomer(Model model, @PathVariable int id){

        Customer customer = customerService.getMyCustomerById(id);
        model.addAttribute("key_customer", customer);

        return "/customer/customer_th";
    }

    // http://localhost:8080/customertemplate/customers/all
    @GetMapping(path = "/customers/all")
    public String getAllCustomersWithNewTemplate(Model model){
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("key_customers_list", customerList);
        return "/customer/customers_th";
    }



}
