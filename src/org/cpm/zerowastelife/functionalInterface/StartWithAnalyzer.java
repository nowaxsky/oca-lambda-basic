package org.cpm.zerowastelife.functionalInterface;

public class StartWithAnalyzer implements StringAnalyzer {

	@Override
	public boolean analyze(String target, String searchStr) {
		return target.startsWith(searchStr);
	}

}
