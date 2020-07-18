package practiceOne;

public class Q1 {

	public static void main(String args[]) {

		// Find out how many alpha characters are present in a string?

		String name = "alpha, b c ,&, K, %, -50, L, M, *, 55, 60 ";
		


		String newName = name.replaceAll("[^A-Za-z]", "");

		String newName1 = name.replaceAll("[^1-9]", "");

		String Characters = name.replace("%", "$ ");

		System.out.println(newName);

		System.out.println("only Numeric " + newName1);

		System.out.println(Characters);

		// How to find out the part of the string from a string? What is substring? Find
		// number of words in string?

		System.out.println("++++++++++++++++++++++++++++++++ Substring Question +++++++++++++++++++++++++++");
		String IQ5 = "Hello World, this is Exerciese";

		String newIQ5 = IQ5.substring(11);
		System.out.println(" Substring = " + newIQ5);

		String[] NumberOf_Words = IQ5.split(" ");

		int result1 = NumberOf_Words.length;

		System.out.println("Number of words in String " + result1);

		System.out.println("********************************************************");
		// Write a java program to reverse String? Reverse a string word by word?

		String revers = "This is Java Class";

		StringBuffer sb = new StringBuffer(revers);

		System.out.println(sb.reverse());
		
		String john = "John is my friend";
		StringBuffer sb1 = new StringBuffer(john);
		System.out.println(sb1.reverse());
		
		String poli = "MOM isi MOM";
		StringBuffer pol1 = new StringBuffer(poli);
		System.out.println(pol1.reverse());
		

		System.out.println(" ************************** Plindrom **********************************************");

		// Write a Java Program to find whether a String is a palindrome or not.

		String polindrome = "momee";

		String result3 = "";

		StringBuffer bf = new StringBuffer(polindrome);

		StringBuffer newbf = bf.reverse();

		System.out.println(newbf);

		System.out.println(" Second method by IF condition ");

		String org = "Mom";

		String org1 = "";

		for (int i = org.length() - 1; i >= 0; i--) {

			org1 = org1 + org.charAt(i);

		}

		if (org.equalsIgnoreCase(org1)) {
			System.out.println("given string is polindrome");
		} else
			System.out.println("given string is not polindrome");

	}
}