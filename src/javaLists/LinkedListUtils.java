package javaLists;

import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

    public static void insertSorted(LinkedList<Integer> list, int value) {
        if (list != null) {
            int position = 0;
            for (int listValue : list) {
                if (listValue >= value) {
                    break;
                }
                position++;
            }
            list.add(position, value);
        }
    }


    public static void removeMaximumValues(LinkedList<String> list, int N) {
        if (list != null && list.size() != 0 && N > 0) {
            if (N >= list.size()) {
                list.clear();
            } else {
                LinkedList<String> auxList = (LinkedList) list.clone();
                auxList.sort(String::compareToIgnoreCase);
                int position = 0;
                while (position < list.size() - N) {
                    auxList.removeFirst();
                    position++;
                }
                list.removeAll(auxList);
            }
        }
    }

    public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
        if (one == null && two == null || one.size() == 0 && two.size() == 0 || !one.contains(two.getFirst())) {
            return false;
        }
        int initialPosition = one.indexOf(two.getFirst());
        for (int valuesFromListTwo : two)
        {
            if (initialPosition == one.size() || valuesFromListTwo != one.get(initialPosition)) {
                return false;
            }
            initialPosition++;
        }
        return true;
    }
}
