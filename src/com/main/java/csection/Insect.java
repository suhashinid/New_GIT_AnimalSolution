package com.main.java.csection;

public class Insect extends Animal implements IFlyable{
	
	
	private IFlyableBehaviour flyBehavior;
	
	public Insect(IFlyableBehaviour flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}
	public Insect()
	{
		
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	public void setFlyBehaviour(IFlyableBehaviour flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}
	public IFlyableBehaviour getFlyBehaviour()
	{
		return this.flyBehavior;
	}
	
}
