package com.cjss.demo.service;


public class HelloService {

    private WeekService weekService;

    public String getDetails() {
        return weekService.getWeekDay(1);
    }

    public void dummyMethod() {
        // TODO:
    }

    public void dummyMethod(String value1) {
        // TODO:
    }

    public void dummyMethod(String value1, String value2) {
        // TODO:
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

    public WeekService getWeekService() {
        return weekService;
    }

    public void setWeekService(WeekService weekService) {
        this.weekService = weekService;
    }
}
