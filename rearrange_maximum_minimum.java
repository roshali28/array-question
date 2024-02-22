import java.util.*;
public class rearrange_maximum_minimum {
public static void rearrange(int arr[]) {
	Arrays.sort(arr);
	int p=0;
	int q=arr.length-1;
	int ans[]= new int[arr.length];
	for(int i =0;i<arr.length;i++) {
		if(i%2 == 0) {
			ans[i]=arr[q--];
		}
		else {
			ans[i]=arr[p++];
		}
	}
	System.out.println(Arrays.toString(ans));
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		rearrange(arr);


	}

}
