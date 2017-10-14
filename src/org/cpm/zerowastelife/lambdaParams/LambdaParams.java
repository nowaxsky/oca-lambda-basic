package org.cpm.zerowastelife.lambdaParams;

public class LambdaParams {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Interface1 interface1Best = () -> 100;
		
		Interface2 interface21 = (int x) -> 2 * x;
		Interface2 interface22 = (x) -> 2 * x;
		Interface2 interface2Best = x -> 2 * x;
		
		Interface3 interface3 = (int x, int y) -> x + y;
		Interface3 interfaceBest = (x, y) -> x + y;

		Interface4 interface41 = (a, b) -> a.startsWith(b);
		Interface4 interface42 = (a, b) -> a.length() > b.length();
		
		//a.startsWith(b) is a boolean method but it works
		Interface5 interface51 = (a, b) -> a.startsWith(b);
		
		//compile error
		//Interface5 interface52 = (a, b) -> a.length() > b.length();
	}

}
