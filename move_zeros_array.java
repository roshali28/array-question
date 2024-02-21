import java.util.*;
public class move_zeros_array {
public static void move_0(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] != 0) {
			arr[count++]=arr[i];
		}
	}
	while(count < arr.length) {
		arr[count++]=0;
	}
	System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		int arr[]= {1, 2, 0, 4, 3, 0, 5, 0};
		move_0(arr);

	}

}
