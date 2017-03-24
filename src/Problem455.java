import java.util.Arrays;

public class Problem455 {
	public int findContentChildren(int[] g, int[] s) {
		int childrenFed = 0;
		
		Arrays.sort(s);
		Arrays.sort(g);
		
		for(int i = 0, cookUsed = 0; i < g.length; i++){
			for(int j = 0+cookUsed; j < s.length; j++){
				if(g[i] <= s[j]){
					s[j] = -1;
					childrenFed++;	
					cookUsed++;
					break;
				}
			}
		}
		
		return childrenFed;
	}
}
