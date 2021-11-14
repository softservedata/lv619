package _05_arraysLoops.hw5;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import hwArraysLoopsTests.AllTests;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//Add Unit Tests to each task
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(AllTests.class);
	}
	////////////////////////////////////////////////////////////////////////////
}