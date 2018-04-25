import java.util.HashMap;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class WithCollections {
	public static void main(String args[]) {
		var map = new HashMap<>();
		var varMap = new HashMap<>();    // infers as HashMap<Object>, it works, it compiles

		var x = new HashMap<String, Integer>();  // infers as HashMap<String, Integer>, it works, it compiles
	}
}
