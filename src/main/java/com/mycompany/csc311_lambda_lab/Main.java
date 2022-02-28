/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc311_lambda_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
// Example of using lamda expressions
        Taxes theTax;
        theTax = (double gross, double percent) -> {
            return gross - (gross * percent);
        };
        System.out.println(theTax.taxCalc(100, 0.3));

        Assignment a;
        List<Assignment> la = new ArrayList<Assignment>();

        a = new Assignment("Homework 1", 85);
        la.add(a);

        a = new Assignment("Homework 2", 80);
        la.add(a);

        a = new Assignment("Homework 3", 100);
        la.add(a);

        a = new Assignment("Exam 1", 75);
        la.add(a);

        a = new Assignment("Exam 2", 90);
        la.add(a);
        
        Stream<Assignment> assignmentStream;
        la.stream().forEach(System.out::println);
        
        System.out.println("");
        
        System.out.println("Show only grades");
        la.stream().map(x -> x.getGrade()).forEach(System.out::println);
        
        System.out.println("");
        
        System.out.println("Show only high grades");
        la.stream().map(x -> x.getGrade()).filter(x -> x >= 90).forEach(System.out::println);
    }
}
