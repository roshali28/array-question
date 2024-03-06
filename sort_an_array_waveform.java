import java.util.*;
public class sort_an_array_waveform {
public static void waveform(int arr[]) {
	Arrays.sort(arr);
	for(int i =0;i<arr.length-1;i+=2) {
		swap(arr,i,i+1);
	}
	System.out.println(Arrays.toString(arr));
}
public static void swap(int arr[],int a,int b) {
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}
	public static void main(String[] args) {
	int arr[]= {10, 90, 49, 2, 1, 5, 23};
	waveform(arr);
	}
}
