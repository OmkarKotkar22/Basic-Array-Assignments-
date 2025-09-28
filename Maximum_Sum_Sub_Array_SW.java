/*Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.*/


import java.util.*;
public class Maximum_Sum_Sub_Array_SW
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the values in array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//enter the size of array
		System.out.println("Enter the Size of Sub Array: ");
		int k = sc.nextInt();

		//logic
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= (a.length-k); i++)
		{
			int sum = 0;
			System.out.printf("Windows  ---> [");
			for(int j = i; j < (i+k); j++)
			{
				sum = sum + a[j];
				System.out.print(a[j]+", ");
			}
			System.out.println("]");
			if(max < sum)
			{
				max = sum;
			}
		}
		System.out.println("Maximum Sum Subarray of Size K: " + max);
	}
}