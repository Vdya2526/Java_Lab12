package lab12;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        List<String> l2 = new ArrayList<String>();
        l2.add("d");

        List<String> l3 = new ArrayList<String>();

        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println("list1: " + l1);
        System.out.println("list2: " + l2);
        System.out.println("joined: " +l3);
	}

}
