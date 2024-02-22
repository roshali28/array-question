import java.util.*;
public class even_position_greater_than_odd_position {
public static void sort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j+1]<arr[j]) {
				int temp = arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
public static void rearrange(int arr[]) {
	sort(arr);
	int p=0;
	int q=arr.length-1;
	int ans[] = new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		if((i+1)%2 == 0) {
			ans[i]=arr[q--];
		}
		else {
			ans[i]=arr[p++];
		}
	}
	System.out.println(Arrays.toString(ans));
}
	public static void main(String[] args) {
		int arr[]= {4,3,10,1,0,3,48,-1,4,-9};
		rearrange(arr);

	}

}
