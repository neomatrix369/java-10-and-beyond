// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class WithInterface {
	public static void main(String args[]) {
		// Would this work and compile?
		var runnable = new Runnable() {
			@Override
			public void run() {
			}
		};

		// Would this work and compile? Whats the new type?
		runnable = new Runnable() {
			@Override
			public void run() {
			}
		};
	}
}
