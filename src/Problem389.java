import java.util.ArrayList;

public class Problem389 {
	public char findTheDifference(String s, String t) {
		ArrayList<Character> tList = new ArrayList<Character>();
		for(char c : t.toCharArray()){
			tList.add(c);
		}
		for(char c : s.toCharArray()){
			tList.remove((Object)c);
		}
		return tList.get(0);
	}
}
