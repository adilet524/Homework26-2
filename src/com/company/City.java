package com.company;

import java.util.Objects;

public class City implements Comparable<City> {
    private String name;
    private int code;

    public City() {
    }

    public City(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "{\nCode: " + code + " Name: " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    @Override
    public int compareTo(City o) {
        return code > o.code ? -1 : 1;
    }
}
