//1. Given a String Vishak1a, find out the index of 1 in lowest complexity.
import java.util.Scanner;  
public class FindIndex {
	
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string with a interger i.e. vishak1a");  
   		String str=sc.next();  				
		System.out.println(str.split("[a-z]").length-1);
		System.out.println("Complexity is O(n)");

		
	}
}

