package com.cjss.demo.service;

import com.cjss.demo.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private List<EmployeeModel> employees;

    public List<EmployeeModel> add(EmployeeModel employeeModel) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employeeModel);
        return employees;
    }

    public EmployeeModel get(int id) {

        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();

        return first.isPresent() ? first.get() : null;
    }

    public List<EmployeeModel> get(String designation) {

        List<EmployeeModel> employeesList = employees.stream().filter(employeeModel -> employeeModel.getDesignation().equals(designation)).collect(Collectors.toList());

        return employeesList;
    }

    public void delete(int id) {

        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();

        first.ifPresent(employeeModel -> employees.remove(employeeModel));
    }


}

/**
 * Task: Move Employee and Student to Spring boot
 * EmployeeService -> This will call InitDataService.getEmployees() & EmployeeFacade -> all methods
 * initiate data - InitDataService -> return getEmployees() -> List<Employee>
 * EmployeeFacade -> retrieveAllEmployeesByCountry(), retrieveAllEmployeesByCity(String ...city)
 *
 * Practice how to handle exceptions
 */