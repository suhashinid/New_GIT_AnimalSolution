package com.main.java.csection;

public class Parrot extends Bird{
	
	public Parrot(ILivingNearBy nearby, IFlyableBehaviour flyable, IWalkableBehaviour walkableAnimal) {
		super(flyable, nearby.getSingable(),walkableAnimal);
		// TODO Auto-generated constructor stub
	}

	public Parrot()
	{
		
	}

}
