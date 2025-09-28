/*7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/


import java.util.Scanner;
public class Intersection_of_Two_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of First Array: ");
		int size1 = sc.nextInt();

		int arr1[] = new int[size1];

		System.out.println("Enter the Elements in First Array: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the Size of Second Array: ");
		int size2 = sc.nextInt();

		int arr2[] = new int[size2];

		System.out.println("Enter the Elements in Second Array: ");

		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}

		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println("Intersection elements: " +arr1[i]);
				}	
			}
		}
	}
}



