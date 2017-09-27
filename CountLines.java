//5.WAP to count the number of lines in minimum complexity.

public class CountLines {

	public static void main(String[] args) {
		String str="Line1\nLine2\nLine3\nLine4\nLine5";
		System.out.println(str);
		System.out.println("No of lines: "+str.split("\n").length);
		System.out.println("Complexity is O(n)");

	}

}
