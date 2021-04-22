package Lab6day10;
import java.util.*;

public class Excercise1 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("a", 1);
		map.put("e", 5);
		map.put("g", 7);
		map.put("f", 6);
		map.put("c", 3);
		map.put("d", 4);
		map.put("b", 2);
		Excercise1 e=new Excercise1();
		List<Integer> values=e.getValues(map);
		for(int i:values) {
			System.out.print(i+" ");
		}	
	}
	
	//--------------Get the values of a map in sorted order------------------
	
	private List<Integer> getValues(Map<String, Integer> map) {
		List<Integer> l = new ArrayList<>();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			l.add(map.get(k));		
		}
		Collections.sort(l);
		return l;
	}
	

}
