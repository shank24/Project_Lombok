package com.lombok.examples.getterandsetter;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        person.setFirstName("Elena");
        person.setLastName("Gilbert");
        person.setSsn("129876");

        System.out.println(person.toString());
    }
}
