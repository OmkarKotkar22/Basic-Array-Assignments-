/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/

import java.util.Scanner;
public class Find_Missing_Value_In_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size in Array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];

		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
                

		for(int i = 0; i < a.length-1; i++)
		{
			int diff = a[i+1] - a[i];
			if(diff > 1)
			{
				for(int j = a[i] + 1; j < a[i+1]; j++)
				{
					System.out.println("output: " + j);
				}
			}
		}
              		
	}
}