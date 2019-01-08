package main;

public class Learning3 {

	public static void main(String[] args) {

		String s = "    My name is arif hossain        ";
		String y = "hello";
		String z = "Hello";

		System.out.println("Lenght of s: " + s.length());
		// System.out.println("Lenght of s: "+s.length());
		System.out.println(s.substring(0, 2));
		System.out.println(s.indexOf('n'));
		System.out.println(s.charAt(11));
		System.out.println(s.contains("is"));
		System.out.println(s.equalsIgnoreCase(z));
		System.out.println(s.equalsIgnoreCase("Hello"));
		System.out.println(s.trim());
		
		
	}

}
