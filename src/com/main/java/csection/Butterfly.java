package com.main.java.csection;


public class Butterfly extends Insect{
	
	//private IFlyable flyable;
	//private boolean isTransformed;
	Insect state = null;
	
	private IFlyableBehaviour flyBehavior;
	
	
	public Butterfly(IFlyableBehaviour flyBehavior)
	{
		super(flyBehavior);
		this.flyBehavior = flyBehavior;
		state = new CaterpillarState(flyBehavior);
	}
	
	

	public void setSize(String size)
	{
		this.state.setSize(size);
	}


	public String getSize()
	{
		return this.state.getSize();
	}
	public String getColor() {
		return this.state.getColor();
	}
	public void setColor(String color) {
		this.state.setColor(color); 
	}
	
	public void fly() {
		this.state.fly();
	}
	public void setFlyBehaviour(IFlyableBehaviour flyBehavior)
	{
		this.state.setFlyBehaviour(flyBehavior);
	}
	public IFlyableBehaviour getFlyBehaviour()
	{
		return this.state.getFlyBehaviour();
	}

	
	
	void transForm()
	{
		state = new ButterflyState(this.flyBehavior);
	}
	
class ButterflyState extends Insect{
	
	private IFlyableBehaviour flyBehavior;
	
	public ButterflyState(IFlyableBehaviour flyBehavior)
	{ super(flyBehavior);
		this.flyBehavior = flyBehavior;
	}

	
}
 class CaterpillarState extends Insect{
	 private IFlyableBehaviour flyBehavior;
	 public CaterpillarState(IFlyableBehaviour flyBehavior)
	 {
		 super(flyBehavior);
			this.flyBehavior = flyBehavior;
	 }

}
}
