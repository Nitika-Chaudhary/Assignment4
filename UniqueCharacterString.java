package assignment3;

public class UniqueCharacterString {
	
	    public static void main(String[] args) {
	        String s = "Hello, World!";
	        boolean isUnique = true;
	        
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar =s.charAt(i);
	            
	            for (int j = i + 1; j < s.length(); j++) {
	                if (currentChar == s.charAt(j)) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            
	            if (!isUnique) {
	                break;
	            }
	        }
	        
	        if (isUnique) {
	            System.out.println("The string contains all unique characters.");
	        } else {
	            System.out.println("The string contains duplicate characters.");
	        }
	    }
	}


