package assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
	String s1="";
	String s2="";
	System.out.println("Enter the first string");
	s1= scan.nextLine();
	System.out.println("Enter the second string");
	s2= scan.nextLine();
	
	char[] ch1= s1.toCharArray();
	char[] ch2= s2.toCharArray();
	 
	  Arrays.sort(ch1);
	Arrays.sort(ch2);

	 if(Arrays.equals(ch1, ch2))
	 {
		System.out.println("It is Anagram"); 
	 }

	 else
		 
	 {
		 System.out.println("It is not Anagram");  
	 }
	      }

		}




