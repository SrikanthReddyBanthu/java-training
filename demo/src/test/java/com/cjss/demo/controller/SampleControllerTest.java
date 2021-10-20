package com.cjss.demo.controller;

import com.cjss.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {

    @Mock
    private HelloService helloService;

    @InjectMocks
    private SampleController sampleController;

    @Test
    public void testGetDetails() {

        // Given
        when(helloService.getDetails()).thenReturn("dummy test details");

        // When
        String data = sampleController.getData();
//        String actualResponse = helloService.getDetails();

        // Then
        assertEquals("Greetings from Spring Boot!dummy test details", data);
        verify(helloService).dummyMethod();
//        verify(helloService).dummyMethod("rama");
        verify(helloService, times(1)).dummyMethod(anyString());
        verify(helloService).dummyMethod(anyString(), eq("gopi"));

    }

}