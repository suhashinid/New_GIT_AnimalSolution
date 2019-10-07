package com.main.java.bsection;

public class SingableAnimal implements ISingable {
	private String noise;
	public void sing() {
		System.out.println("I am singing..."+noise);
		
	}
  public SingableAnimal(String noise){
	  this.noise=noise;
  }
	
}
