/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/

import java.util.Scanner;
public class Whether_Array_Is_SortedOrNot
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

		boolean flag = true;
		for(int i = 0; i < size-1; i++)
		{
			if(a[i] > a[i+1])
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}