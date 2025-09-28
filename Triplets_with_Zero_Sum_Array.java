/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/


import java.util.Scanner;
public class Triplets_with_Zero_Sum_Array
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

		for(int i = 0; i < a.length-2; i++)
		{
			for(int j = i + 1; j < a.length-1; j++)
			{
				for(int k = j + 1; k < a.length;k++)
				{
					if((a[i] + a[j] + a[k]) == 0)
					{
						System.out.println("(" + a[i] + ", " + a[j] + ", " + a[k] + ")");
					}
				}
			}
		}
	}
}