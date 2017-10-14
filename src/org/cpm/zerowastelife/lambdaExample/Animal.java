package org.cpm.zerowastelife.lambdaExample;

public class Animal {

	private String name;
	private boolean canJump;
	private boolean canSwim;
	
	public Animal(String name, boolean canJump, boolean canSwim) {
		super();
		this.name = name;
		this.canJump = canJump;
		this.canSwim = canSwim;
	}

	public boolean CanJump() {
		return canJump;
	}

	public boolean CanSwim() {
		return canSwim;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
