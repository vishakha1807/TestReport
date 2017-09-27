//1. Given a String Vishak1a, find out the index of 1 in lowest complexity.

public class FindIndex {
	
	public static void main(String[] args) {
		String str = "Vishak1a";
		System.out.println(str.split("[a-z]").length+1);
		System.out.println("Complexity is O(n)");

		
	}
}

