

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

    public static void insertSorted(LinkedList<Integer> list, int value) {

        if (list.size() != 0) {


            int counter = 0;
            while (value > list.get(counter)) {
                counter++;
            }

            list.add(counter, value);

        }
    }


    public static void removeMaximumValues(LinkedList<String> list, int N) {

        //This method removes all instances of the N largest values in the LinkedList.

        LinkedList<String> newList = new LinkedList<String>();

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

        // get first distinct N elements
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i)) && counter<=N){
                newList.addFirst(list.get(i));
                counter++;
            }
        }

        //remove all instances of N elements
        list.removeAll(newList);

    }

    public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		if (one.isEmpty() || two.isEmpty()){
		    return false;
        }

            //start with list one
            //go over list two


        //repeat for two case

        return true; // this line is here only so this code will compile if you don't modify it
    }
}
