package assignment3;

public class MaxOccuringChar {
	
	    
	    public static void main(String[] args) {
	        String s = "Hello_iNeuron";
	        
	        int[] charCounts = new int[256]; // Assuming ASCII character set
	        
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            charCounts[currentChar]++;
	        }
	        
	        char maxOccurringChar = '\0';
	        int maxCount = 0;
	        
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] > maxCount) {
	                maxCount = charCounts[i];
	                maxOccurringChar = (char) i;
	            }
	        }
	        
	        System.out.println("Original string: " + s);
	        System.out.println("Maximum occurring character: " + maxOccurringChar);
	        System.out.println("Count: " + maxCount);
	    }
	}


