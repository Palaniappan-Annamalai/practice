
package com.bny.sonarlint.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

class Animal{

}

class Tiger{}
public class Practice {

    // -2^7 to 2^7 -1 = -128 to 127
    // -2^15 to 2^15 -1 = -32768 to 32767
    // -2^31 to 2^31 -1 = -2147483648 to 2147483647
    // -2^63 to 2^63 -1 = -9223372036854775808l; to 9223372036854775807l;


    public static void get(Tiger p){
        System.out.println("D");
    }
    public static void get(Animal l){
        System.out.println("d");
    }



    public static void main(String[] args)  throws Exception{



        


    }



    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }



    public void set(Person p){
          System.out.println("Obj");
    }

    public void set(Employee e){
       System.out.println("String");
    }
}

class Person{

    public void get() throws RuntimeException{

    }
}

class Employee extends Person{

    @Override
    public void get() {

        return;
    }

}

class Instructor extends Employee {

    int id;

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                '}';

    }

}