//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.stream.Stream;
//
import java.math.BigDecimal;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class PrimitivesAndBigDecimal {
	public static void main(String args[]) {
		// int
		var integerValue = 5;
		// String
		var stringValue = "Hello World";
		// BigDecimal
		var bigDecimal = BigDecimal.ONE;
		bigDecimal = BigInteger.TEN;      // <=== type differs, this not allowed, it does not compile

		final var finalInteger = 10;      // <=== like val in Scala, this is allowed, it does compile
	}
}
