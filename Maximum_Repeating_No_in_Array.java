/*Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7*/


import java.util.Scanner;
public class Maximum_Repeating_No_in_Array
{
	public static void main(String x[])
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements in the Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(count > size/2)
			{
				System.out.println("The maximum repeating number is: " + count);
				break;
			}
		}
		
	}
}