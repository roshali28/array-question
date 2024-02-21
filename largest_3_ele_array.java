import java.util.*;
public class largest_3_ele_array {
	public static void sort(int arr[],int N) {
		if(N<3) {
			System.out.println("Invalid input");
		}
		int first,second,third;
		first=second=third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third){
				third=arr[i];
			}
		}
		System.out.println(first+" "+second+" "+third);
		
		
// SECOND METHOD.......
		
		
		/*for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length-1;i>=3;i--) {
			System.out.print(arr[i]+" ");
		}*/
		
		
		
	}
	public static void main(String[] args) {
	int arr[]= {10, 4, 3, 50, 23, 90};
	sort(arr,arr.length);
		
		
	
	}

}
