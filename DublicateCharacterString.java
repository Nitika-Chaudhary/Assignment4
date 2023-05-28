package assignment3;

import java.util.Scanner;

public class DublicateCharacterString {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("write the string here:");
		String s1=scan.nextLine();
		StringBuilder s2 = new StringBuilder();
		for(int i=0; i<s1.length(); i++)
		{    
			char currentChar=s1.charAt(i);
		            for (int j =i+1 ; j <s1.length(); j++)
		            {
		                if (s1.charAt(j) == currentChar)
		                {
		                	s2.append(currentChar);
		                	break;
		                }
		            }
		}
		            
		           
		        
		 System.out.println("String after removing duplicates: " + s2);
		    }
		}



	


