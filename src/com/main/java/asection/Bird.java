package com.main.java.asection;

public class Bird extends Animal{
	
	private IFlyable flyBehavior;
	private ISingable singingBehavior;
	
	public Bird(IFlyable flyBehavior, ISingable singingBehavior) {
		this.flyBehavior = flyBehavior;
		this.singingBehavior = singingBehavior;
	}
	
	public void sing() {
	singingBehavior.sing();
	}
	
	public void fly() {
		flyBehavior.fly();
	}

}
