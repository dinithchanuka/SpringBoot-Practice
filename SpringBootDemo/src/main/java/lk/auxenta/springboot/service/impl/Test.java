package lk.auxenta.springboot.service.impl;

import lk.auxenta.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class Test {

    @Autowired
    CustomerService customerService;

    @GetMapping("/name")
    public String name(){
        //CustomerService customerService = new CustomerServiceImpl();
        System.out.println("Hiiii "+customerService.getMyName());
        return  customerService.getMyName();
    }

    @GetMapping("/age")
    public Integer age(){
       // CustomerService customerService1 = new CustomerServiceImpl();
        System.out.println("Age: "+customerService.getAge());
        return customerService.getAge();
    }
}
