package home.assignment.week1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] a= {1, 4,3, 2, 8, 6, 7};
		
		Arrays.sort(a);
		//1, 2, 3, 4, ---,6, 7

int length = a.length;
System.out.println(length);
	
		for (int i = 0; i < length; i++) {
			if (a[i]+1 != a[i+1]) {
				/*a[0]+1 !=  a[1] 
				 *    2  != 2
				 *    
				 *a[1]+1 !=  a[2]  
				 *        3  != 3
				 *        
				/*a[2]+1 !=  a[3]  
				 *        4  != 4
				 *   
				 *a[3]+1 !=  a[4]  
				 *  5  != 6       
				 *    
				 * a[4]+1 !=  a[5]  
				 *  7  != 7         
				 *       
				 *        
				 */
				System.out.println("missing number :"+(a[i]+1));
				
				
				
			}
			
			
		}
		
	
			
		}

	}

