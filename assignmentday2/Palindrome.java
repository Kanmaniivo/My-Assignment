package assignmentday2;

public class Palindrome {

	public static void main(String[] args) {

		int num=121;
		int rev=0;
		int rem;

		int Ori=num;

		while(num!=0) {

			rem = num%10;
			rev = rev*10 + rem;
			num/=10;

		}
		if(Ori==rev) {
			System.out.println(Ori+"This is Palindrome");
		}
		else { System.out.println(rev+ "This is not Palindrome");
		}
	}
}