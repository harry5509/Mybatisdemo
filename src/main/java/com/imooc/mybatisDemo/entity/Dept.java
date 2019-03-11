package com.imooc.mybatisDemo.entity;

import java.util.List;

public class Dept {

    private Integer id;

    private String departmentName;

    private List<Person> persons;

    public Dept() {
    }

    public Dept(Integer id, String departmentName, List<Person> persons) {
        this.id = id;
        this.departmentName = departmentName;
        this.persons = persons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
