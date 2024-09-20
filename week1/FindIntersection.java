package home.assignment.week1;

public class FindIntersection {

	public static void main(String[] args) {
   /*
    * how outer and inner loop work
    * a[0]=3  b[0]=1
    * a[0]=3  b[1]=2
    * a[0]=3  b[2]=8
    * a[0]=3  b[3]=4
    * a[0]=3  b[4]=9
    * a[0]=3  b[5]=7
    * 
    * 
    * a[1]=2  b[0]=1
    * a[1]=2  b[1]=2
    * a[1]=2  b[2]=8
    * a[1]=2  b[3]=4
    * a[1]=2  b[4]=9
    * a[1]=2  b[5]=7
    * 
    * a[2]=11  b[0]=1
    * a[2]=11  b[1]=2
    * a[2]=11  b[2]=8
    * a[2]=11  b[3]=4
    * a[2]=11  b[4]=9
    * a[2]=11  b[5]=7
    * 
    * so on it compare if a[i]=b[j]
    */
		
		
		int[] a= {3,2,11,4,6,7};
		
		int[] b= {1,2,8,4,9,7};
		
	int length = a.length;
	int length2 = b.length;
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < b.length; j++) {
			if (a[i]==b[j]) {
			System.out.println("match element : "+a[i]);	
			
			}
				
			}

			
		}
	}

}
