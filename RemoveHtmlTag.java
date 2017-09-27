//4.Given a string " <h1> I don't want to be header </h1>", WAP to remove the h1 html tag from the string.
 
public class RemoveHtmlTag {

	public static void main(String[] args) {
		String str=" <h1> I don't want to be header </h1>";
		str = str.replaceAll("\\<.*?\\>", "");
		System.out.println(str);
		System.out.println("Complexity is O(n)");

	}

}
