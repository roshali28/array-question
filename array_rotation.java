import java.util.*;
public class array_rotation {
public static void rotate(int arr[],int k) {
	int n=arr.length;
	k=k%n;
	reverse(arr,0,k-1);
	reverse(arr,k,arr.length-1);
	reverse(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
}
public static void reverse(int arr[],int left,int right) {
	while(left<right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
	}
}
	public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    rotate(arr,2);
    rotate(arr,15);
	}

}
