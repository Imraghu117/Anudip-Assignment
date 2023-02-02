package labtest5;

import java.util.TreeSet;

public class IterateTS {

	public static void main(String[] args) {
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("blue");
		  tree_set.add("red");
		  tree_set.add("Orange");
		  tree_set.add("white");
		  tree_set.add("Black");
		 
		  for (String element : tree_set) {
		    System.out.println(element);
		    }

	}

}