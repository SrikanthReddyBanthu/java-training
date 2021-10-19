package com.cjss.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class HelloServiceTest {

    @InjectMocks
    private HelloService helloService;

    @Test
    public void testGetDetails() {
        String actualResponse = helloService.getDetails();

        assertEquals("Dummy details", actualResponse);
    }

    @Test
    public void testGetWeekDayConditions() {
        String actualResponse = helloService.getWeekDay(0);
        assertEquals("Sunday", actualResponse);
        assertEquals("Invalid Input", helloService.getWeekDay(10));
    }

}