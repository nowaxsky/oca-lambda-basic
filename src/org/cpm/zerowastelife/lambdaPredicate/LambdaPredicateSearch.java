package org.cpm.zerowastelife.lambdaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.cpm.zerowastelife.lambdaExample.Animal;

public class LambdaPredicateSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("monkey", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("human", true, true));
		
		System.out.println("The following animals can jump: ");
		check(animals, a -> a.CanJump());
		
		System.out.println("\nThe following animals can swim: ");
		check(animals, a -> a.CanSwim());

	}
	
	//Predicate can replace IChecker by default, it's used in boolean-return-method
	public static void check(List<Animal> animals, Predicate<Animal> checker) {
		
		for(Animal animal: animals) {
			if(checker.test(animal)) System.out.println("--" + animal + "--");
		}
	}

}
