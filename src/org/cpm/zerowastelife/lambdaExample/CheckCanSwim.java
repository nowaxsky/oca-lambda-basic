package org.cpm.zerowastelife.lambdaExample;

public class CheckCanSwim implements IChecker {

	@Override
	public boolean test(Animal a) {
		return a.CanSwim();
	}

}
