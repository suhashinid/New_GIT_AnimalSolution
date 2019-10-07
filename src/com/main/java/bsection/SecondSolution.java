package com.main.java.bsection;

import com.main.java.bsection.Duck;

public class SecondSolution {

	public static void main(String[] args) {
		String noise="Quack Quack";
		Duck duck = new Duck(new FlyableWithWings(), new SingableAnimal(noise));
		
		duck.sing();
		duck.fly();
		
		noise="Cluck Cluck";
		Chicken chik = new Chicken(new NonFlyable(), new SingableAnimal(noise));
		
		chik.sing();
		chik.fly();
	}

}
