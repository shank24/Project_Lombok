package com.lombok.examples.getterandsetter;

import lombok.NonNull;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;

@Log4j
public class Test {


    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(30);
        person.setFirstName("Elena");
        person.setLastName("Gilbert");
        person.setSsn("129876");

        System.out.println(person.toString());

        test(person);
    }

    public static void test(@NonNull Person person){

        //requireNonNull(person);
        System.out.println("No way person is null : " + person);
        log.info("Message from Logger");
    }
}
