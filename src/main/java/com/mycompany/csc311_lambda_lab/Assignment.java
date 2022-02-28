package com.mycompany.csc311_lambda_lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soblab
 */
public class Assignment {
    private String theType;
    private int grade;
    
    public Assignment(String assignmentType , int theGrade){
        theType = assignmentType;
        grade = theGrade;
    }
    

    public String getTheType() {
        return theType;
    }

    public void setTheType(String theType) {
        this.theType = theType;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        return theType + ", " + grade;
    }
}
