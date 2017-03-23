import java.math.BigInteger;

public class Problem371 {
//	public int getSum(int a, int b) {
//		BigInteger bi = BigInteger.valueOf(a);
//		bi = bi.add(BigInteger.valueOf(b));
//		return bi.intValue();
//	}
	// Bit Manipulation
	// Yup, using BigInteger was definitely cheating
	public int getSum(int a, int b) {
		if(a == 0) return b;
		else if(b == 0) return a;
		
		while(b != 0){
			int leftOver = a & b;
			a = a ^ b;
			b = leftOver << 1;
		}
		
		return a;		
	}
}
