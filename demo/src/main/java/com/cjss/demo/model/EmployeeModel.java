package com.cjss.demo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeModel {

    @Min(value = 1, message = "id should have min value of 1")
    @Max(value = 10, message = "id should have max value as 10")
    private int id;
    @NotNull(message = "Name should not be null")
    private String name;
    @Pattern(regexp="^[a-zA-Z0-9]{3}",message="designation length must be 3")
    private String designation;

    public EmployeeModel(int id, String name, String designation) {

        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
