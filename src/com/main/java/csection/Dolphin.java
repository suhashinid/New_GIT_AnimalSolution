package com.main.java.csection;

public class Dolphin extends Animal implements ISwimmable{
	
	private ISwimmableBehaviour swimmable;

	public Dolphin(ISwimmableBehaviour swimmable)
	{
		super();
		this.swimmable=swimmable;
	}
	
	public Dolphin() {
		// TODO Auto-generated constructor stub
		this.swimmable = new SwimmableAnimal();
	}

	public ISwimmableBehaviour getSwimmable() {
		return swimmable;
	}

	public void setSwimmable(ISwimmableBehaviour swimmable) {
		this.swimmable = swimmable;
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I am swimming..");
	}

	@Override
	public ISwimmableBehaviour getSwimmableBehaviour() {
		
		return this.swimmable;
	}

	@Override
	public void setISwimmableBehaviour(ISwimmableBehaviour swimmableBehaviour) {
		
		this.swimmable=swimmableBehaviour;
	}
	
	

}
