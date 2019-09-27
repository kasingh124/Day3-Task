package org.cts;

public class Sample11 {
	public static void main(String[] args) {
		String s= "Ashok Sing   "
				+ ""
				+ "h";
		String s2="Singh";
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
	}

}
