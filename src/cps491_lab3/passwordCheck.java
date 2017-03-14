/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cps491_lab3;

import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Cody
 */
public class passwordCheck {
    /* package whatever; // don't place package name! */
/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
            System.out.println("Suhhhh");
	}
	
	public static boolean propLength(String thePassword){
	   return thePassword.length() >= 8;
	}
	
	public static boolean charsSpec( String thePassword ){
                String firstEight = thePassword;
                if( propLength(firstEight) )
                    firstEight = firstEight.substring(0,8);
                int total = 0;
                if( firstEight.matches(".*[A-Z].*") ) total++;
                if( firstEight.matches(".*[a-z].*") ) total++;
                if( firstEight.matches(".*[!@#$%&*(){}|:;/<>.,].*") ) total++;
                if( firstEight.matches(".*[0-9].*") ) total++;
                return total >= 3;
	}
        
        public static boolean validPassword( String thePassword ){
            return propLength(thePassword) && charsSpec(thePassword);
        }
}