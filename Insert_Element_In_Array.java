/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/

import java.util.Scanner;
public class Insert_Element_In_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Value in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the Index: ");
		int index = sc.nextInt();

		System.out.println("Enter the Value: ");
		int value = sc.nextInt();

		for(int i = (a.length-2); i >= index; i--)
		{
			a[i+1] = a[i];
		}
		a[index] = value;

		System.out.println("Display the Array: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Index" + i + "Value" + a[i]);
		}		
	}
}