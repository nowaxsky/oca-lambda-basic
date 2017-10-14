package org.cpm.zerowastelife.functionalInterface;

/**
 * @FunctionalInterface only allows one method in interface
 * @author CPM
 *
 */
@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String target, String searchStr);
}
