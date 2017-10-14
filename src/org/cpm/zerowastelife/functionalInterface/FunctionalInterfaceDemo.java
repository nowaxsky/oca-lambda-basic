package org.cpm.zerowastelife.functionalInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		System.out.println("-----Old method-----");
		String target = "Jim is teaching";
		String searchStr = "Jim";
		
		StringAnalyzer sa1 = new ContainsAnalyzer();
		StringAnalyzer sa2 = new StartWithAnalyzer();
		
		System.out.println(analyzeString(sa1, target, searchStr));
		System.out.println(analyzeString(sa2, target, searchStr));
		
		System.out.println("\n-----Lambda-----");		
		//use lambda implements interface, so we don't need class ContainsAnalyzer and StartWithAnalyzer class
		StringAnalyzer lambdaSa1 = (t,s) -> t.contains(s);
		StringAnalyzer lambdaSa2 = (t,s) -> t.startsWith(s);
		
		System.out.println(analyzeString(lambdaSa1, target, searchStr));
		System.out.println(analyzeString(lambdaSa2, target, searchStr));

	}
	
	private static boolean analyzeString(StringAnalyzer analyzer, String target, String searchStr) {
		return analyzer.analyze(target, searchStr);
	}

}
