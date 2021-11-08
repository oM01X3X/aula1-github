package reserve;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List1 {

	public static void main(String[] args) {
	
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		list.remove("Ana");
		for (String ajf : list) {
			System.out.println(ajf);
		}
		
		System.out.println("--------------------------------------");
		list.removeIf(ajf -> ajf.charAt(0) == 'M');
		
		for (String ajf : list) {
			System.out.println(ajf);
		}
		
		System.out.println("--------------------------");
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(ajf -> ajf.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String ajf : list) {
			System.out.println(ajf);
			
			System.out.println("------------------------------------------");
			
			String name = list.stream().filter(a -> a.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name);
		}
	}
}
