import java.util.*;
public class Second_largest_ele {
public static void element(Integer arr[]) {
	/*for(int i=0;i<arr.length;i++) {
		for(int j=0;j< arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
	}
	int second_max=arr[arr.length-2];
	int i=2;
	while(second_max == arr[arr.length-1]) {
		i=i+1;
		second_max = arr[arr.length-i];
	}
	System.out.println(second_max);*/
	
	Arrays.sort(arr,Collections.reverseOrder());
	for(int i=1;i<arr.length;i++) {
		if(arr[i] != arr[0]) {
			System.out.println(arr[i]);
			return;
		}
	}
	System.out.println("there is no second element");
}
	public static void main(String[] args) {
		Integer arr[]= {4,3,10,1,0,3,48,48,38,48,47,48,-1,4,-9};
		element(arr);

	}

}
