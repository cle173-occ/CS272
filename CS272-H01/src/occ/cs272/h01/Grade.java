/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author <cle173>
 * @version <09/09/2019>
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cle173";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
        //TODO Complete this method
        if(grade.equalsIgnoreCase("A")) {
        	
        	return 4.0;
        }
        if(grade.equalsIgnoreCase("A+")){
    		return 4.0;
    	}
        if(grade.equalsIgnoreCase("A-")){
    		return 3.7;
    	}
        if(grade.equalsIgnoreCase("B")) {
        	
        	return 3.0;
        }
        if(grade.equalsIgnoreCase("B+")) {
    		return 3.3;
    	}
        if(grade.equalsIgnoreCase("B-")){
    		return 2.7;
    	}
        if(grade.equalsIgnoreCase("C")) {
        	
        	return 2.0;
        }
        if(grade.equalsIgnoreCase("C+")) {
    		return 2.3;
    	}
        if(grade.equalsIgnoreCase("C-")){
    		return 1.7;
    	}
        if(grade.equalsIgnoreCase("D")) {

        	return 1.0;
        }
        if(grade.equalsIgnoreCase("D+")) {
    		return 1.3;
    	}
        if(grade.equalsIgnoreCase("D-")){
    		return 0.7;
    	}
        if(grade.equalsIgnoreCase("F")) {
        	
        	return 0.0;
        }
        
        return -1.0; 
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
