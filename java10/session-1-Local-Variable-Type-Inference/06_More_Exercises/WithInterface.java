// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class WithInterface {
	public static void main(String args[]) {
		// Inference uses fixed typing
		var runnable = new Runnable() {
			@Override
			public void run() {
			}
		};

		// incompatible types: <anonymous Runnable> cannot be converted to <anonymous Runnable>
		// even though they appear to be the same syntically or semantically
		runnable = new Runnable() {
			@Override
			public void run() {
			}
		};
	}
}
