package Lab6day10;
import java.util.*;
import java.time.*;
public class Excercise6 {
	public static void main(String[] args) {
		HashMap<Integer,LocalDate> map = new HashMap<>();
		map.put(1001, LocalDate.of(2004, 3, 03));
		map.put(1002, LocalDate.of(2000, 7, 05));
		map.put(1003, LocalDate.of(1999, 1, 15));
		map.put(1004, LocalDate.of(1975, 12, 4));
		map.put(1005, LocalDate.of(1993, 9, 17));
		map.put(1006, LocalDate.of(1980, 5, 19));
		map.put(1007, LocalDate.of(2016, 12, 23));
		
		List<Integer> eligibleList = new Excercise6().votersList(map);
		for(int i:eligibleList) {
			System.out.println(i);
		}
	}

	//-----------------------Generate the list of voters based on the ages of the people -------------------------------
	
	public static List<Integer> votersList(HashMap<Integer,LocalDate> map){
		List<Integer> list=new ArrayList<>();
		Iterator<Integer> itr=map.keySet().iterator();
		LocalDate currentDate=LocalDate.now();
		while(itr.hasNext()) {
			int k=itr.next();
			Period age=map.get(k).until(currentDate);
			if(age.getYears()>18)list.add(k);
		}
		return list;	
	}
}
