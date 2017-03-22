
public class Problem500 {
	public String[] findWords(String[] words) {
		String[] Row = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		String[] answers = new String[words.length];
		int count = 0;
		for(int i = 0; i < words.length; i++){
			char[] curr = words[i].toLowerCase().toCharArray();
			boolean r1 = true, r2 = true, r3 = true;
			for(int j = 0; j < curr.length; j++){
				if(r1 && !Row[0].contains(curr[j]+""))
					r1 = false;
				if(r2 && !Row[1].contains(curr[j]+""))
					r2 = false;
				if(r3 && !Row[2].contains(curr[j]+""))
					r3 = false;
			}
			if(r1 || r2 || r3){
				answers[count] = words[i];
				count++;
			}
		}
		String[] finalAnswer = new String[count];
		for(int i = 0; i < count; i++){
			finalAnswer[i] = answers[i];
		}
		return finalAnswer;
	}
}
