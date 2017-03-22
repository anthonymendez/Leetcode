import java.util.ArrayList;
import java.util.List;

public class Problem412 {
	public List<String> fizzBuzz(int n) {
		List<String> arr = new ArrayList<String>(); 
		for(int i = 1; i <= n; i++){
			String ans = "";
			if(i % 3 == 0)
				ans += "Fizz";
			if(i % 5 == 0)
				ans += "Buzz";
			if(ans.length() == 0)
				ans += i;
			arr.add(ans);
		}
		return arr;
	}
}
