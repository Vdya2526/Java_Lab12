package lab12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program4 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		  
	        // populate the list
	        list.add(12);
	        list.add(53);
	        list.add(30);
	        list.add(8);
	  
	        // printing the List
	        System.out.println("List: " + list);
	  
	        // getting minimum value
	        // using min() method
	        int min = Collections.min(list);
	  
	        // getting maximum value
	        // using max() method
	        int max = Collections.max(list);
	  
	        // printing the minimum value
	        System.out.println("Minimum value of list is: "
	                           + min);
	  
	        // printing the maximum value
	        System.out.println("Maximum value of list is: "
	                           + max);
	    }

	}

