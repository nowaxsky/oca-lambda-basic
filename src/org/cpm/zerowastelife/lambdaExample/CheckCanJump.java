package org.cpm.zerowastelife.lambdaExample;

public class CheckCanJump implements IChecker {

	@Override
	public boolean test(Animal a) {
		return a.CanJump();
	}

}
