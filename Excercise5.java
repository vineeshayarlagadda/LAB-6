package Lab6day10;
import java.util.*;

public class Excercise5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of integer array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int result=getSecondSmallest(arr);
		System.out.println("The second smallest element in the given array is : "+result);
	}
	
	//-----------------------Get the second smallest element in the array-----------------------
	
	
	public static int getSecondSmallest(int arr[]) {
		List<Integer> list=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			Collections.sort(list);
		}
		return list.get(1);
	}
}
