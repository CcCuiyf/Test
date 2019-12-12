import java.util.*;

public class Main {


	public static void main(String[] args) {
		int flag=0;
		Map<Person,Double> personMap= new HashMap<>();
		Person person1=new Person("lilei",18);
		Person person2=new Person("hanmeimei",17);
		Person person3=new Person("Lihua",19);
		personMap.put(person1,1.0);
		personMap.put(person2,2.0);
		personMap.put(person3,3.0);
		Iterator<Map.Entry<Person,Double>> it= personMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Person,Double> entry=it.next();
			if(entry.getKey()==person1) {
				System.out.println("111");
				flag=1;
				break;
			}
		}
		if(flag==0) System.out.println("000");

		flag=0;
		ArrayList<Person> c = new ArrayList<Person>();
		c.add(person1);
		c.add(person2);
		c.add(person3);
		c.remove(person3);
		Iterator iit=c.iterator();
		while(iit.hasNext()){
			Person p= (Person) iit.next();
			if(p==person1) {
				flag=1;
				System.out.println("111");
				break;
			}
		}
		if(flag==0) System.out.println("000");



	}

}
