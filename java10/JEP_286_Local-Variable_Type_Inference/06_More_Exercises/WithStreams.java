import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class WithStreams {
	public static void main(String args[]) {
		// Declaration and assigning of local variable by executing a method
		Stream<String> stream = getStream(); // <=== infers type ?????, is this allowed or compiles?
		
		var varStream = getStream();   // Would this work and compile?
	}

	public static Stream getStream() {
		// Local variable with streams
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		return strings.stream();  // Would this work and compile?
	}
}
