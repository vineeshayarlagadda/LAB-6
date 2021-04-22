package Lab6day10;
import java.util.*;

public class Excercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of integer array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=getSquares(arr,size);
		System.out.println(map);
	}
	
	//------------------Accepts a list of numbers and return their squares------------------
	
	public static HashMap<Integer,Integer> getSquares(int arr[],int size) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<size;i++) {
			map.put(arr[i], arr[i]*arr[i]);
		}
		return map;
	}
}
