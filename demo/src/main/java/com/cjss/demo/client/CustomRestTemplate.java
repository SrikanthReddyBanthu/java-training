package com.cjss.demo.client;

import com.cjss.demo.model.CustomerDetailsModel;
import com.cjss.demo.model.CustomerModel;
import com.cjss.demo.model.PersonalDetailsModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomRestTemplate {

    public CustomerModel[]  getAllCustomers() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8081/get-all";
        ResponseEntity<CustomerModel[]> response
                = restTemplate.getForEntity(fooResourceUrl, CustomerModel[].class);
        System.out.println(response.getStatusCode());
        return response.getBody();
    }

    public String addCustomer(CustomerModel customerModel) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8081/add-customer";
        HttpEntity<CustomerModel> request = new HttpEntity<>(customerModel);
        ResponseEntity<String> response = restTemplate
                .exchange(fooResourceUrl, HttpMethod.POST, request, String.class);

        return response.getBody();
    }
}
