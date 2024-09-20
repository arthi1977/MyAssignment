package home.assignment.week1;

public class IsPrimeNumber {

	public static void main(String[] args) {

		int number = 5;
		int count = 0;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				count++;
				
				//5%2==1 5%3==2   5%4==1  ------count greater then 0  5%5==0  equal to 0
				
			}
			if (count > 0) {
				System.out.println("Number is not Prime");

			} else {
				System.out.println("it is Prime Number");
			}
		}
	}
	
}