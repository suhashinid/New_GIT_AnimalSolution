package com.main.java.csection;

import com.main.java.util.Voice;

public class RoosterNearBy implements ILivingNearBy{
	private String noise ="Cock-a-Doodle-Do";
	private ISingableBehaviour singable = new SingableAnimal(new Voice(noise));
	
	@Override
	public ISingableBehaviour getSingable() {
		// TODO Auto-generated method stub
		return singable;
	}

}
