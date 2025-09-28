//Q17.  Write a java program to check majority element of array.


import java.util.Scanner;
public class Check_Majority_Element_in_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		int count = 0;
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
	
		for(int i = 0; i < size; i++)
		{
			boolean flag = false;
			for(int j = 0; j < size; j++)
			{
				flag = true;
				if(a[i] == a[j])
				count++;
			}
			if(count > size/2 && flag == true)
			{
				System.out.println("====================");
				System.out.println(a[i] + ": is Majority Element");
				break;
			}
			else
			{
				System.out.println("No Majority Element");
			}
		}
	}
}