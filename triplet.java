package assignment5;
import java.util.*;
public class triplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[size];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		sc.close();
		min(arr1, arr2, arr3);
	}

	public static void min(int[] arr1, int[] arr2, int arr3[]) {
		int m=Integer.MAX_VALUE,sum=0,sum1=0;
		int []ans=new int [3];
		for (int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				for (int k=0;k<arr3.length;k++) {
					int min=0,max=0,dif=0;
					min=Math.min(arr1[i],arr2[j]);
					min=Math.min(min,arr3[k]);
					max=Math.max(arr1[i],arr2[j]);
					max=Math.max(max,arr3[k]);
					dif=max-min;
					if (dif<m) {
						ans[0]=arr1[i];
						ans[1]=arr2[j];
						ans[2]=arr3[k];
						sum=ans[0]+ans[1]+ans[2];
						m=dif;
					}if (dif==m) {
						sum1=arr1[i]+arr2[j]+arr3[k];
						if(sum1<sum) {
							ans[0]=arr1[i];
							ans[1]=arr2[j];
							ans[2]=arr3[k];
						}
					}
					//System.out.println(sum);
				}
			}
		}
		Arrays.sort(ans);
		for (int i=ans.length-1;i>=0;i--) {
			System.out.print(ans[i]+" ");
		}
		
	}
}
