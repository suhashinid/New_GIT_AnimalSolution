package com.main.java.asection;

public class FirstSolution {

	public static void main(String[] args) {

		Bird bird = new Bird(new FlyableWithWings(), new SingableAnimal());
		
		bird.sing();
		bird.fly();
	}

}
