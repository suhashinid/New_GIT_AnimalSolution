package com.main.java.csection;

public class Fish extends Animal implements ISwimmable{
	private ISwimmableBehaviour swimmableBehaviour;
	
	public Fish(ISwimmableBehaviour swimmable)
	{
		this.swimmableBehaviour=swimmable;
	}
	public void swim()
	{
		//System.out.println("I am swimming...");
		swimmableBehaviour.swim();
	}
	public Fish()
	{
		this.swimmableBehaviour=new SwimmableAnimal();
	}
	@Override
	public ISwimmableBehaviour getSwimmableBehaviour() {
		return this.swimmableBehaviour;
	}
	@Override
	public void setISwimmableBehaviour(ISwimmableBehaviour swimmableBehaviour) {
	
		this.swimmableBehaviour = swimmableBehaviour;
	}
}
