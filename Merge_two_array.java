//Q9. Write java program to merge two array and display it.

import java.util.Scanner;
public class Merge_two_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of  first array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
                System.out.println("Enter the size of  second array: ");
                int size1 = sc.nextInt();
		int b[] = new int[size1];
		int c[] = new int[size+size1];
                int j=0;

		System.out.println("Enter the element in first array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
                        c[j]=a[i];
                         j++;
		}
               
		System.out.println("Enter the element in second array: ");		
		for(int i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
                         c[j]=b[i];
                         j++;
		}

                for(int i=0;i<c.length;i++){
                   System.out.println(c[i]);
                    }
	}
}