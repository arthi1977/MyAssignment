package home.assignment.week1;

public class PalindromeNumber {

	public static void main(String[] args) {
	int a=12345;
	
	int reverseNum=0;
	
	while (a!=0) {
		int lastDigit = a%10;
		reverseNum =reverseNum*10+lastDigit;
		a=a/10;
		
		System.out.println(reverseNum);
	}

	}

}
