package labtest5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		ArrayList<String> ArrList = new ArrayList<String>();
		 
       
        ArrList.add(" blue");
        ArrList.add(" black");
        ArrList.add(" red");
        ArrList.add(" green");
        ArrList.add(" pink");
 

        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
  
        Collections.swap(ArrList, 2, 3);
 
 
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);

	}

}
