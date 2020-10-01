package collection;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		
		/**
		 * Generic : 특정 타입의 객체만 삽입할 수 있도록 제한하는 기능
		 * 	- e.g.) ArrayList<String> list = new ArrayList<String>();
		 */

		ArrayList<String> list = new ArrayList<>(); // list = []
		list.add("string1"); 						// list = ["string1"]
		list.add("string2"); 						// list = ["string1", "string2"]
		
		System.out.println(list.get(0)); // string1
		System.out.println(list.get(1)); // string2
		
		list.add(0, "string3"); 					// list = ["string3", "string1", "string2"] 하나씩 밀려나면서 시간이 오래 걸릴 수 있음
		System.out.println(list.get(0)); // string3
		
		System.out.println(list.contains("string1")); // true
		System.out.println(list.contains("string5")); // false
	
		list.remove(1); 							// list = ["string3", "string2"]
		list.add("string2");						// list = ["string3", "string2", "stirng2"]
		list.remove("string2"); // list = ["string3", "string2"] 1번 삭제, 앞에서부터 삭제 됨
		
		System.out.println(list.size()); // 2
		System.out.println(list.isEmpty()); // false
		
		list.add("string2"); // list = ["string3", "string2", "stirng2"]		
		System.out.println(list.indexOf("string2")); // 1
		System.out.println(list.lastIndexOf("string2")); // 2

	}

}
