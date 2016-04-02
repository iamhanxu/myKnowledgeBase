package com.leo.regex;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public void testPatternMatch(String regex, String target) {

		// design a simple pattern matching application
		// for a given pattern
		// find all the occurance in a target
		// step1:define the pattern
		Pattern p = Pattern.compile(regex);
		// step2:find all the matchers occurances for the given target
		Matcher m = p.matcher(target);

		int counter = 0;

		while (m.find()) {
			counter++;
			System.out.println(m.start() + "..." + (m.end() - 1) + "  " + m.group());
		}

		System.out.println("occurances= " + counter);

	}

	/*
	 * 
	 * pattern.split(target)
	 * 
	 */
	public void testPatternSplit(String regex, String target) {

		Pattern p = Pattern.compile(regex);
		String[] s = p.split(target);

		for (String str : s) {
			System.out.println(str);
		}

	}

	/*
	 * target.split(regex)
	 * 
	 */
	public void testSpringSplit(String regex, String target) {

		if (regex == null || target == null)
			return;

		String[] result = target.split(regex);

		for (String str : result) {
			System.out.println(str);
		}
	}

	public void testStringTokenizer(String regex, String target) {

		StringTokenizer st = new StringTokenizer(target, regex);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public static void main(String[] args) {

		RegExDemo demo = new RegExDemo();

		demo.testPatternSplit("a+", "ddsaaaagdsaa34");

	}

}
