import java.math.BigInteger;

public class Problem371 {
	public int getSum(int a, int b) {
		BigInteger bi = BigInteger.valueOf(a);
		bi = bi.add(BigInteger.valueOf(b));
		return bi.intValue();
	}
}
