
public class Person {

	// TODO
	public static int count;
	public static int  getCount(){
		return count;
	}

	String name;

	public Person(String name) {
		this.name = name;
		count++;
	}

}
