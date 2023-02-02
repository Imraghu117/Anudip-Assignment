package labtest5;

import java.util.ArrayList;
import java.util.List;

public class DeleteElement {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("black");
		  list_Strings.add("blue");
		  list_Strings.add("red");
		  list_Strings.add("White");
		  list_Strings.add("pink");
		  
		  System.out.println(list_Strings);
		 
		  list_Strings.remove(2);

		  System.out.println("After delete third element from the list:\n"+list_Strings);

	}

}
