package com.realdolmen.servlet_course.repository;

import com.realdolmen.servlet_course.domain.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by TDKBG57 on 9/10/2017.
 */
public class PersonRepository {
    public List<Person> findAll(){
        return Arrays.asList(
                new Person("Tjen", "Dekker", 23),
            new Person("Gust", "ff", 25)
        );
    }
}
