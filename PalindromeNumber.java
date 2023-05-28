package assignment3;



public class PalindromeNumber {
	
		public static void main(String[] args) {
			 int num=2552;
			 int orgnum=num;
			 int rev=0;
			 while(num!=0)
			 {
				rev = rev*10+ num%10;
				num= num/10; 
			 }
			 
			 if(orgnum==rev)
			 {
				 System.out.println( +orgnum +" is palindrome"); 
			 }
			 else 
			 {
				 
				 System.out.println(+orgnum +"  is not palindrome");	 
			 }
		}

	}


