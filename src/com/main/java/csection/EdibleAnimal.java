package com.main.java.csection;

import com.main.java.util.Food;


public class EdibleAnimal implements IEdible{

	private Food food;
	public void eat() {
		System.out.println("I am eating..."+food.getFood());
		
	}
  public EdibleAnimal(Food food){
	  this.food=food;
  }

}
