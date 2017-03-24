
public class Problem383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] magAmt = new int[128], noteAmt = new int[128];
		for(char c : ransomNote.toCharArray())
			noteAmt[c]++;
		for(char c : magazine.toCharArray())
			magAmt[c]++;
		for(int i = 0; i < 128; i++){
			if(magAmt[i] < noteAmt[i])
				return false;
		}
		return true;
	}
}
