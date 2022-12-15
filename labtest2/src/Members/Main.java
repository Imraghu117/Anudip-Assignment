package Members;

//this class is created to call the main function and make instances of all the classes declared according to the use 
public class Main {

	public static void main(String[] args) {
		Address add = new Address(23, "chi 1", "Noida");
		Address add1 = new Address(25, "Zeta 1", "Noida");
		Employee em = new Employee("Raghvendra Singh", 21, "7084xxxx", add, "40,000", "Web Devlopment", "Technical");
		Manager man = new Manager("Rahul", 23, "989XXXX", add1, "60,000", "Human Resources", "HR");
		
		em.print();
		System.out.println();
		man.print();
		
	}

}