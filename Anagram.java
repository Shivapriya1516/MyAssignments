package week3.Day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="mug";
	String text2="gum";
	//Check if the lengths of the two strings are equal: 
	if(text1.length()!=text2.length())
	{
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	}
	// Convert both the strings to character arrays
	char[] ch1=text1.toCharArray();
	char[] ch2=text2.toCharArray();
	
	//Sort both the character arrays
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	//Check if the sorted arrays are equal 
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println("The given strings are Anagram");
	}
	else
	{
		System.out.println("The given strings are not an Anagram.");
	}
}
}
