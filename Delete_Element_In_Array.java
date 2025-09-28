/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/

import java.util.Scanner;
public class Delete_Element_In_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the index value: ");
		int index = sc.nextInt();

		for(int i = index; i < size - 1; i++)
		{
			a[i] = a[i+1];
		}
		size--;
		
		System.out.println("Display the Array: ");
		for(int i = 0; i < size; i++)
		{
			System.out.println("Index" + i + "Value" + a[i]);
		}
	}
}