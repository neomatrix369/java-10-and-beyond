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
		bigDecimal = BigInteger.TEN;      // <=== is this allowed, does it compile

		final var finalInteger = 10;      // <=== something similar in Scala? is this allowed, does it compile
	}
}
