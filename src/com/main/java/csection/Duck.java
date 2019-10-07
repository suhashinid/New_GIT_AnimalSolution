package com.main.java.csection;

import com.main.java.bsection.FlyableWithWings;
import com.main.java.bsection.SingableAnimal;

public class Duck extends Bird {

	private ISwimmableBehaviour swimmableBehaviour;
	public Duck(IFlyableBehaviour flyBehavior, ISingableBehaviour singingBehavior, ISwimmableBehaviour swimmableBehaviour,IWalkableBehaviour walkableAnimal) {
		super(flyBehavior, singingBehavior, walkableAnimal);
		this.setSwimmableBehaviour(swimmableBehaviour);
		// TODO Auto-generated constructor stub
	}
	public Duck()
	{
		
	}

	public ISwimmableBehaviour getSwimmableBehaviour() {
		return swimmableBehaviour;
	}
	public void setSwimmableBehaviour(ISwimmableBehaviour swimmableBehaviour) {
		this.swimmableBehaviour = swimmableBehaviour;
	}
	public void swim() {
		this.swimmableBehaviour.swim();
	}

	
}
