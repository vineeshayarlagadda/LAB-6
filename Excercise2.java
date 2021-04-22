package Lab6day10;
import java.util.*;

public class Excercise2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the characters in the array : ");
		char arr[]=sc.next().toCharArray();
		HashMap<Character,Integer> hm=countChars(arr);
		System.out.println(hm);
	}
	
	//-----------method that accepts a character array and count the number of times each character is present in the array-----------
	
	
	public static HashMap<Character,Integer> countChars(char arr[]){
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])count++;
			}
			map.put(arr[i],count);
		}
		return map;
	}
}


