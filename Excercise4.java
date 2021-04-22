package Lab6day10;
import java.util.*;

public class Excercise4 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(101, 76);
		map.put(102, 70);
		map.put(103, 84);
		map.put(104, 94);
		map.put(105, 100);
		map.put(106, 89);
		map.put(107, 80);
		HashMap<Integer,String> hm=getStudents(map);
		System.out.println(hm);
		
	}
	//------------------------Generate the list of students eligible for scholarship--------------------------
	
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> map){
		HashMap<Integer,String> hm=new HashMap<>();
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int k=itr.next();
			int v=map.get(k);
			if(v>=90) hm.put(k,"Gold");
			else if(v>=80 && v<90) hm.put(k,"Silver");
			else if(v>=70 && v<80) hm.put(k,"Bronze");
		}
		return hm;
	}
}
