package collection;

import java.util.HashMap;

public class HashMapApp {

	public static void main(String[] args) {

		/**
		 *  Map : Key, value 형식의 자료구조
		 *   - e.g.) HashMap<String, String> map = new HashMap<>();
		 *   
		 *  순서가 없으며, 키는 유일해야 하고, value는 중복이 가능하다.
		 */
		
		HashMap<String, Person> map = new HashMap<>(); // map = []
		
		map.put("key1", new Person("person1", 30)); // map = [("key1", Person("person1", 30))]
		map.put("key2", new Person("person2", 20)); // map = [("key1", Person("person1", 30)), ("key2", Person("person2", 20))]

		Person person = map.get("key1");
		System.out.println(person.getAge());  // 30
		System.out.println(person.getName()); // person1
		
		map.put("key1", new Person("person3", 10)); // map = [("key1", Person("person3", 30)), ("key2", Person("person2", 20))]
		
		person = map.get("key1");
		System.out.println(person.getAge());  // 10
		System.out.println(person.getName()); // person3
		
		System.out.println(map.containsKey("key2")); // true, key는 string 타입으로 equals, hashcode 전부 재정의가 되어 있어서 같다고 판단 가능
		System.out.println(map.containsValue(new Person("person1", 30))); //false
		System.out.println(map.containsValue(new Person("person2", 20))); //false, new로 만들어서 비교하면 주소값이 달라서 안 됨
					
		/**
		 * Map에서 객체를 비교할 때는 equals, hashcode를 이용한다.
		 * 객체를 처음 생성하면 equals 메서드는 ==과 동일하다. (주소값 비교) 
		 */
		
	}

}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public Person() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/**
	 * equals method
	 * 1. name이 동일하다.
	 * 2. age가 동일하다.
	 * <=> Person이 동일하다.
	 */
	
	
	
}