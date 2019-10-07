package com.main.java.csection;

abstract public class Animal {
	//int noofeyes;
	private String size;
	private String color;
	private IEdible edible;
	Animal()
	{
		
	}
	public void setSize(String size)
	{
		this.size=size;
	}


	public String getSize()
	{
		return this.size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void eat()
	{
		System.out.println("I can eat..");
	}
	public IEdible getEdible() {
		return edible;
	}
	public void setEdible(IEdible edible) {
		this.edible = edible;
	}
}
