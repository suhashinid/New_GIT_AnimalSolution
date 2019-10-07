package com.main.test.asection;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


import com.main.java.asection.FirstSolution;

public class UnitTestRunner {

	public UnitTestRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Result result = JUnitCore.runClasses(FirstSolution.class);
		    for (Failure failure : result.getFailures()) {
		      System.out.println(failure.toString());
		     
		    }
		    
		    //assertTrue(result.);
	}
	 
}
