package com.main.java.csection;

import com.main.java.util.Voice;

public class Bird extends Animal implements IFlyable,ISingable,IWalkable{
	
	private IFlyableBehaviour flyBehavior;
	private ISingableBehaviour singingBehavior;
	private IWalkableBehaviour walkableBehaviour;
	public Bird(IFlyableBehaviour flyBehavior, ISingableBehaviour singingBehavior,IWalkableBehaviour walkable) {
		this.flyBehavior = flyBehavior;
		this.singingBehavior = singingBehavior;
		this.walkableBehaviour = walkable;
	}
	
	public Bird() {
		// TODO Auto-generated constructor stub
		this.flyBehavior = new FlyableWithWings();
		this.singingBehavior = new SingableAnimal(new Voice(""));
		this.walkableBehaviour = new WalkableAnimal();
	}
	
	
	public void setFlyBehaviour(IFlyableBehaviour flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}
	public IFlyableBehaviour getFlyBehaviour()
	{
		return this.flyBehavior;
	}
	public void setSingingBehaviour(ISingableBehaviour singingBehavior)
	{
		this.singingBehavior = singingBehavior;
	}
	public ISingableBehaviour getISingingBehaviour()
	{
		return this.singingBehavior;
	}

	@Override
	public ISingableBehaviour getSingableBehaviour() {
		
		return this.singingBehavior;
	}

	@Override
	public void setISingableBehaviour(ISingableBehaviour singableBehaviour) {
		
		this.singingBehavior = singableBehaviour;
		
	}
	
	public IWalkableBehaviour getWalkableBehaviour() {
		return walkableBehaviour;
	}

	public void setIWalkableBehaviour(IWalkableBehaviour walkableBehaviour) {
		this.walkableBehaviour = walkableBehaviour;
	}
	public void sing() {
		singingBehavior.sing();
		}
		
		public void fly() {
			flyBehavior.fly();
		}
		@Override
		public void walk() {
			// TODO Auto-generated method stub
			getWalkableBehaviour().walk();
		}

	

}
