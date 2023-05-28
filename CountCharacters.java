package assignment3;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("write the original string:");
		
		String s1=scan.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = Character.toLowerCase(s1.charAt(i));
            
            if (currentChar >= 'a' && currentChar <= 'z') {
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                        || currentChar == 'o' || currentChar == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCharCount++;
            }
        }
        
        System.out.println("Original string: " + s1);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Special character count: " + specialCharCount);
    }
	}


