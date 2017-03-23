
public class Problem258 {
	public int addDigits(int num) {
		if(num < 10)
			return num;
		int move = 0;
		for(int i = 0; i < (num+"").toCharArray().length; i++){
			move += Integer.parseInt((num+"").toCharArray()[i]+"");
		}
		return addDigits(move);
	}
}
