package assignment3;
import java.util.Scanner;

public class RemoveDublicateFromString {
	
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("write the string here:");
			String s1=scan.nextLine();
			StringBuilder s2 = new StringBuilder();
			for(int i=0; i<s1.length(); i++)
			{
			            char currentChar = s1.charAt(i);
			            boolean isDuplicate = false;
			            
			            for (int j =0 ; j < i; j++)
			            {
			                if (s1.charAt(j) == currentChar)
			                {
			                    isDuplicate = true;
			                    break;
			                }
			            }
			            
			            if (!isDuplicate) {
			            	s2.append(currentChar);
			            }
			        }
			        
			 System.out.println("String after removing duplicates: " + s2);
			    }
			}

