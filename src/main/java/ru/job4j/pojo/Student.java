package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String group;
    private LocalDate enrolled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int year, int month, int dayOfMonth) {
        this.enrolled = LocalDate.of(year, month, dayOfMonth);
    }
}
