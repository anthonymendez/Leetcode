
public class Problem461 {
	public static void main(String[] args){
		System.out.println(hammingDistance(1,4));
		System.out.println(hammingDistance(1501377268,258791155));
		System.out.println(hammingDistance(2,4));
	}
	
	public static int hammingDistance(int x, int y) {
		String x1 = Integer.toBinaryString(x),
				y1 = Integer.toBinaryString(y);
		if(x1.length() > y1.length() ){
			for(int i = x1.length()-y1.length(); i > 0; i--){
				y1 = "0" + y1;
			}
		}else if(y1.length() > x1.length()){
			for(int i = y1.length()-x1.length(); i > 0; i--){
				x1 = "0" + x1;
			}
		}
		char[] cx = x1.toCharArray(), cy = y1.toCharArray();
		int count = 0;
		for(int i = 0; i < cx.length; i++){
			if(cx[i] != cy[i]){
				count++;
			}
		}
		return count;
	}
}
