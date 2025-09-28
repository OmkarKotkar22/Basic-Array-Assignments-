/*5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/

import java.util.Scanner;
public class Missing_No_from1_to_N_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
              
		for(int i = 0; i < a.length-1; i++)
		{
			int diff= a[i+1]-a[i];
			if(diff>1)
			{
				++a[i];
				System.out.println(a[i]);
                     	}
						
		}
       	}
}