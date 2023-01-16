package lt.ornetas.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // https://localhost:8080/customermapping/test
@RequestMapping(path = "/customermapping")
public class CustomerController{

    @GetMapping( path = "/test" )
    public @ResponseBody String getTestPage(){
        return "This is some test from SPRING!";
    }


}
