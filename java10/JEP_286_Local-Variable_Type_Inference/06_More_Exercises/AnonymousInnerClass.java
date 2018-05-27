import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class AnonymousInnerClass {
	public static void main(String args[]) {
		// Is this allowed, and will it compile?
		var myReversibleStringList = new ArrayList<String>() {
			List<String> list() {
				return Arrays.asList("Larry", "Moe", "Curly");
			}
		};
		System.out.println(myReversibleStringList.list());
	}
}
