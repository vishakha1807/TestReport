//3. WAP to remove non-ascii character from a string in lowest time.

public class RemoveNonASCII {
	public static void main(String[] args) {
		String str="ABCD123ÂÂÂ";
		str = str.replaceAll("[^\\p{ASCII}]", "");
		System.out.println(str);
		System.out.println("Complexity is O(n)");
	}

}
