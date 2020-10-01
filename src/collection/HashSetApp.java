package collection;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>(); // hashSet = {}
		
		hashSet.add(100); // hashSet = {100}
		hashSet.add(0); // hashSet = {100, 0}
		hashSet.add(0); // hashSet = {100, 0}
		
		System.out.println(hashSet.contains(300)); // false
		System.out.println(hashSet.contains(0)); // true
		System.out.println(hashSet.isEmpty()); // false
		
		for(Integer integer : hashSet) {
			System.out.println(integer);
		} // 0 100 순서는 관계 없음
		
		hashSet.remove(100); // hashSet = {0}
		System.out.println(hashSet.size()); // 1
	}

}
