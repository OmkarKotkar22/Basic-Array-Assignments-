/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/

import java.util.Scanner;
public class Count_All_Pairs_withDifference_Array
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
		
		System.out.println("Enter the Difference Value: ");
		int k = sc.nextInt();

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i; j < a.length; j++)
			{
				if(a[i] - a[j] == k || a[j] - a[i] == k)
				{
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}
}