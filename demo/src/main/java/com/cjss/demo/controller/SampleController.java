package com.cjss.demo.controller;

import com.cjss.demo.client.CustomRestTemplate;
import com.cjss.demo.model.CustomerModel;
import com.cjss.demo.model.EmployeeModel;
import com.cjss.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private CustomRestTemplate customRestTemplate;

    @GetMapping("/get-data")
    public CustomerModel[] getCustomers() {
        return customRestTemplate.getAllCustomers();

    }
    @PostMapping("/aad-data")
    public String postCustomers(@RequestBody CustomerModel customerModel) {

//        customRestTemplate.post();
        return customRestTemplate.addCustomer(customerModel);

    }

}
