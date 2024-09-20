package home.assignment.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		 //0 1 1 2 3 5 8 13
		// 1 2 F
		//   1 2 F
		//     1 2 F
		//       1 2 F
		
		int firstNum=0;
		int secondNum=1;
	    int fibNum;
		int lenght=8;
		
		for (int i = 0; i <lenght; i++) {
			System.out.println("Fibonacci series :"+firstNum);
		fibNum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=fibNum;
		
		
			
		}

	}

}
