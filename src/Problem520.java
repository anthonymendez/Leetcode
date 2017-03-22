
public class Problem520 {
	public boolean detectCapitalUse(String word) {
		char[] c = word.toCharArray();
		for(int i = 0; i < c.length; i++){
			boolean isUpper = c[i] >= 65 && c[i] <= 90; 
			if(isUpper && i-1 >= 0 && (c[i-1] < 65 || c[i-1] > 90) )
				return false;
			else if(isUpper && i-1 >= 0 && i+1 < c.length && (c[i-1] >= 65 || c[i-1] <= 90) && (c[i+1] < 65 || c[i+1] > 90) )
				return false;
		}
		return true;
	}
}
