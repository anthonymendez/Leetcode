public class Problem2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String val1 = ""+l1.val, val2 = ""+l2.val;
		ListNode currList1 = l1, currList2 = l2;
		while(currList1.next != null){
			currList1 = currList1.next;
			currList2 = currList2.next;
			val1 += currList1.val;
			val2 += currList2.val;
		}
		
		val1 = new StringBuilder(val1).reverse().toString();
		val2 = new StringBuilder(val2).reverse().toString();
		int intval1 = Integer.parseInt(val1);
		int intval2 = Integer.parseInt(val2);
		int result = intval1 + intval2;
		char[] c = new StringBuilder(result+"").reverse().toString().toCharArray();
		ListNode answer = new ListNode(0);
		for(int i = c.length-1; i <= 0; i++){
			answer.val = Integer.parseInt(c[i]+"");
			answer.next = answer;
			System.out.println(answer.val);
		}
		return answer;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x){ 
		val = x; 
	}
}