package com.main.java.csection;

import com.main.java.util.Voice;

public class SingableAnimal implements ISingableBehaviour {
	private Voice noise;
	public void sing() {
		System.out.println("I am singing..."+noise.getVoice());
		
	}
  public SingableAnimal(Voice noise){
	  this.noise=noise;
  }
	
}
