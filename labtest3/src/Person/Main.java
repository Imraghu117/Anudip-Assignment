package Person;

public class Main {

	public static void main(String[] args) {
        //Declaring and initializing the array....
		String[] subjects= {"Java","OS","OOPS"};
		
        //Instantiation of students
		Student s1=new Student("jai Ranjan",22,"7084xxx","82",subjects);
		Student s2=new Student("Rahul",23,"9357xxxx","43",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}
