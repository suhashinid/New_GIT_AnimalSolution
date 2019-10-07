package com.main.java.csection;

import com.main.java.util.Food;
import com.main.java.util.PropertiesUtil;
import com.main.java.util.Voice;

public class ThirdSolution {

	public static void main(String[] args) {
		String noise="Quack Quack";
		Duck duck = new Duck(new FlyableWithWings(), new SingableAnimal(new Voice(PropertiesUtil.getProperty("Duck"))),new SwimmableAnimal(),new WalkableAnimal());
		
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
	
	Shark fish = new Shark(new SwimmableAnimal());
	fish.setSize("Large");
	fish.setColor("Grey");
	fish.setEdible(new EdibleAnimal(new Food("fish")));
	fish.swim();
	ClownFish clFish=new ClownFish(new SwimmableAnimal());
	clFish.setSize("small");
	clFish.setColor("Orange");
	clFish.makeFun();
	clFish.swim();
	Dolphin dolphin = new Dolphin(new SwimmableAnimal());
	dolphin.swim();
	Animal[] animal = new Animal[]{
			new Bird(),
			new Duck(),
			new Chicken(),
			new Parrot(),
			new Rooster(),
			new Fish(),
			new Shark(),
			new ClownFish(),
			new Dolphin(), new Butterfly(new FlyableWithWings())};
	
	int flyingAnimal = 0;
	int swimmingAnimal = 0;
	int singingAnimal = 0;
	int walkingAnimal = 0;
	for(Animal ani:animal)
	{
		if(ani instanceof IFlyable) {
			IFlyable ani2 = (IFlyable)ani;
			
			if(ani2.getFlyBehaviour() instanceof FlyableWithWings) {
				flyingAnimal++;
			}
		}
		if(ani instanceof ISwimmable) {
			ISwimmable ani2 = (ISwimmable)ani;
			
			if(ani2.getSwimmableBehaviour() instanceof SwimmableAnimal) {
				swimmingAnimal++;
			}
		}
		if(ani instanceof ISingable) {
			ISingable ani2 = (ISingable)ani;
			
			if(ani2.getSingableBehaviour() instanceof SingableAnimal) {
				singingAnimal++;
			}
		}
		if(ani instanceof IWalkable) {
			IWalkable ani2 = (IWalkable)ani;
			
			if(ani2.getWalkableBehaviour() instanceof WalkableAnimal) {
				walkingAnimal++;
			}
		}
	}
	System.out.println("flyingAnimal"+flyingAnimal);
	System.out.println("swimmingAnimal"+swimmingAnimal);
	System.out.println("singingAnimal"+singingAnimal);
	System.out.println("walkingAnimal"+walkingAnimal);
	}

}
