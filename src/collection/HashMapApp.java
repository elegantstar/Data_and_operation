package collection;

import java.util.HashMap;

public class HashMapApp {

	public static void main(String[] args) {

		/**
		 *  Map : Key, value ������ �ڷᱸ��
		 *   - e.g.) HashMap<String, String> map = new HashMap<>();
		 *   
		 *  ������ ������, Ű�� �����ؾ� �ϰ�, value�� �ߺ��� �����ϴ�.
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
		
		System.out.println(map.containsKey("key2")); // true, key�� string Ÿ������ equals, hashcode ���� �����ǰ� �Ǿ� �־ ���ٰ� �Ǵ� ����
		System.out.println(map.containsValue(new Person("person1", 30))); //false
		System.out.println(map.containsValue(new Person("person2", 20))); //false, new�� ���� ���ϸ� �ּҰ��� �޶� �� ��
					
		/**
		 * Map���� ��ü�� ���� ���� equals, hashcode�� �̿��Ѵ�.
		 * ��ü�� ó�� �����ϸ� equals �޼���� ==�� �����ϴ�. (�ּҰ� ��) 
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
	 * 1. name�� �����ϴ�.
	 * 2. age�� �����ϴ�.
	 * <=> Person�� �����ϴ�.
	 */
	
	
	
}