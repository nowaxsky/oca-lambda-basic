package org.cpm.zerowastelife.lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("monkey", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("human", true, true));
		
		System.out.println("The following animals can jump: ");
		check(animals, new CheckCanJump());
		
		System.out.println("\nThe following animals can swim: ");
		check(animals, new CheckCanSwim());

	}
	
	public static void check(List<Animal> animals, IChecker checker) {
		
		for(Animal animal: animals) {
			if(checker.test(animal)) System.out.println("--" + animal + "--");
		}
	}

}
