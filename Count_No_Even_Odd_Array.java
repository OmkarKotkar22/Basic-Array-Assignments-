/*6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/

import java.util.Scanner;
public class Count_No_Even_Odd_Array
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

                int count_even = 0;
	        int count_odd = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			
			if(a[i] % 2 == 0)
			{
				count_even++;	
			}
			else
			{
				count_odd++;	
			}	
		}

                 System.out.println("Even no: " + count_even);
                 System.out.println("Odd no: " + count_odd);
	}
}