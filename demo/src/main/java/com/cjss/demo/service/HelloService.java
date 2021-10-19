package com.cjss.demo.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getDetails() {
        return "Dummy details";
    }

    public String getWeekDay(int day) {

        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else {
            return "Invalid Input";
        }
    }

}
