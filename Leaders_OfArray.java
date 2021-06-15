package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Leaders_OfArray {
    public static void main(String[] args)
   {
       
       Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
       printLeaders(arr, size);
   }
   public static void printLeaders(int arr[], int size)
   {
       int max_from_right =  arr[size-1];
 
       System.out.print(max_from_right + " ");
     
       for (int i = size-2; i >= 0; i--)
       {
           if (max_from_right <= arr[i])
           {          
           max_from_right = arr[i];
           System.out.print(max_from_right + " ");
           }
       }   
   }
}