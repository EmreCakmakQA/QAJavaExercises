package object;
import java.util.ArrayList;
import main.Person;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> myList = new ArrayList<>();
		
//		Person barbara = new Person("Barbara", "Doe", 34);
//		Person charles = new Person("Charles", "Doe", 30);
//		Person dan = new Person("Dan", "Doe", 23);
//		Person emre = new Person("Emre", "Doe", 27);
//		Person fred = new Person("Fred", "Doe", 26);
//		Person gary = new Person("Gary", "Doe", 79);
		
		myList.add(new Person("Bob", "Doe", 25));
		myList.add(new Person("Barbara", "Doe", 34));
		myList.add(new Person("Charles", "Doe", 30));
		myList.add(new Person("Dan", "Doe", 23));
		myList.add(new Person("Emre", "Doe", 27));
		myList.add(new Person("Fred", "Doe", 26));
		myList.add(new Person("Gary", "Doe", 79));
		
		for(Person handle: myList) {
			System.out.println(handle.getFirstName() + " " + handle.getAge());
		}
		
	}

}
