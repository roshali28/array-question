import java.util.*;
public class segregate_even_odd {
public static void even_odd(int arr[]) {
	int i=-1;
	int j=0;
	while(j < arr.length) {
		if (arr[j]%2 == 0) {
			i++;
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		j++;
	}
	System.out.println(Arrays.toString(arr));
}
public static void even_odd1(int arr[]) {
	int left = 0;
	int right = arr.length-1;
	while(left < right) {
		while((left < right) && (arr[left]%2 == 0)) {
			left++;
		}
		while((left < right) && (arr[right]%2 == 1)) {
			right--;
		}
		
		if(left < right) {
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
	int arr[]= {7,2,9,4,6,1,3,8,5};	
	even_odd1(arr);
	}

}
