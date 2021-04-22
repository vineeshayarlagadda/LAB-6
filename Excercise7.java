package Lab6day10;
import java.util.*;

public class Excercise7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of integer array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:getSorted(arr)) {
			System.out.print(i +" ");
		}
	}
	
	//--------------Return the resulting array after reversing the numbers and sorting it-----------------


	public static List<Integer> getSorted(int arr[]) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb=new StringBuffer();
			String s=sb.append(arr[i]).reverse().toString();
			arr[i]=Integer.parseInt(s);
		}
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list;
	}

}
