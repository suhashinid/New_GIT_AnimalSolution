package com.main.java.csection;

import com.main.java.util.Voice;

public class SecondSolution {

	public static void main(String[] args) {
		String noise="Quack Quack";
		Duck duck = new Duck(new FlyableWithWings(), new SingableAnimal(new Voice(noise)),new SwimmableAnimal(),new WalkableAnimal());
		
		duck.sing();
		duck.fly();
		duck.swim();
		noise="Cluck Cluck";
		Chicken chik = new Chicken(new NonFlyable(), new SingableAnimal(new Voice(noise)),new WalkableAnimal());
		
		chik.sing();
		chik.fly();
		
		noise="Cock-a-Doodle-Do";
		Rooster roost = new Rooster(new NonFlyable(), new SingableAnimal(new Voice(noise)),new WalkableAnimal());
		
		roost.sing();
		roost.fly();
		
	Parrot parrot = new Parrot(new DogNearBy(), new FlyableWithWings(),new WalkableAnimal() );
		
	parrot.sing();
	parrot.fly();
	 parrot = new Parrot(new CatNearBy(), new FlyableWithWings(),new WalkableAnimal() );
	
	parrot.sing();
	parrot.fly();
	parrot = new Parrot(new RoosterNearBy(), new FlyableWithWings(),new WalkableAnimal() );
	
	parrot.sing();
	parrot.fly();
	}

}
