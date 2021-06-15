package assignment5;

import java.util.*;

public class Reverse_Array {
	
	static void revers(int [] given) {
		int ans[]=new int[given.length];
		int temp;
		for (int i=0;i<ans.length;i++) {
			temp=given[i];
			ans[ans.length-1-i]=given[i];
		}
		
		for (int a:ans) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] given = new int[size];
		for (int i = 0; i < size; i++) {
			given[i] = sc.nextInt();
		}
		revers(given);
	}

}
