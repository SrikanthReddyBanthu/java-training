package com.cjss.demo.service;

import com.cjss.demo.model.EmployeeModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void testGetEmployeeByDesignation() {

        EmployeeModel emp1 = new EmployeeModel(101 , "Rama", "it");
        EmployeeModel emp2 = new EmployeeModel(102 , "John", "Sales");
        EmployeeModel emp3 = new EmployeeModel(103 , "Gopi", "it");
        employeeService.add(emp1);
        employeeService.add(emp2);
        employeeService.add(emp3);

        List<EmployeeModel> employees = employeeService.get("it");

        assertEquals(2, employees.size());
        assertEquals(101, employees.get(0).getId());
        assertSame(emp1, employees.get(0));

    }
    @Test
    public void testGetEmployeeByDesignation1() {


        List<EmployeeModel> employees = employeeService.get("it");

        assertEquals(2, employees.size());
        assertEquals(101, employees.get(0).getId());
//        assertSame(emp1, employees.get(0));

    }

}
