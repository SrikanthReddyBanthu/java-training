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
    public void test() {

        List<EmployeeModel> employees = employeeService.add(new EmployeeModel());
        String s1 = "test1";
        String s2 = "test";
        assertEquals(s2, s1);


    }

}
