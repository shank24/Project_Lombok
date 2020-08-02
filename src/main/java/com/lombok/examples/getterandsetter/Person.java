package com.lombok.examples.getterandsetter;

import lombok.*;
@Data
@Getter(lazy = true)
public class Person {
    private String firstName;
    private String lastName;
    private String ssn;
    private int age;

}
