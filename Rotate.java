package assignment5;

import java.util.*;

public class Rotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int rot = sc.nextInt();
		rotate(arr, rot);
	}

	public static void rotate(int[] arr, int k)
	{
		k = k%arr.length;
		
		if(k<0)
		{
			k += arr.length;
		}
		
		for(int 
				j = 1; j <= k; j++)
		{
			int temp = arr[arr.length-1];
			for(int i = arr.length-1; i >= 1; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
