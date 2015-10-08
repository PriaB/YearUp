
public class Main {

	public static void main(String[] args) 
	{
		Person instructor = new Person("Mr. Owen", 28, "7068543425", "730 Peachtree street");
		System.out.println("Intstuctor's name is " + instructor.GetName());
		System.out.println("Instructor's age is " + instructor.GetAge());
		System.out.println("Instructor's phone number is " + instructor.GetPhoneNumber());
		System.out.println("Instructor's address is " + instructor.GetAddress());
		instructor.GrowsOlder();
		System.out.println("Instructor's age is now " + instructor.GetAge()); 
		// TODO Auto-generated method stub

	}

}
