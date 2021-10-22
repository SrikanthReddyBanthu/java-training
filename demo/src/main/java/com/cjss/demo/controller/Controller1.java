package com.cjss.demo.controller;

import com.cjss.demo.model.EmployeeModel;
import com.cjss.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller1 {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    List<EmployeeModel> add(@Valid @RequestBody EmployeeModel newEmployee) {

        return employeeService.add(newEmployee);
    }

    @GetMapping("/get/{id}")
    EmployeeModel get(@PathVariable Integer id) {

        return employeeService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id, @RequestHeader String data) {
        employeeService.delete(id);
    }

}

/**
 * PATCH with example
 * Enhance existing employee with Salary
 * Query parameters - https://www.baeldung.com/spring-request-param
 * Explore Header params - https://www.baeldung.com/spring-rest-http-headers
 */
