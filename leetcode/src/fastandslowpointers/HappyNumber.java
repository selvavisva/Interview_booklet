package fastandslowpointers;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
	public static boolean isHappy(int n) {
	    int slow = n;
	    int fast = getNext(n);

	    while (fast != 1 && slow != fast) {
	        slow = getNext(slow);
	        fast = getNext(getNext(fast));
	    }

	    return fast == 1;
	}

	private static int getNext(int n) {
	    int sum = 0;
	    while (n > 0) {
	        int digit = n % 10;
	        sum += digit * digit;
	        n /= 10;
	    }
	    return sum;
	}
}