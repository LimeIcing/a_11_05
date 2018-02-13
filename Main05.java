import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main05 {

    /*
    Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges the
    list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
    the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11, 15, 27, 32] after a call
    to your method. Use a Set as part of your solution.
     */

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(-14);
        a.add(-8);
        a.add(-10);
        a.add(-19);
        a.add(-13);
        a.add(-2);
        a.add(-11);
        a.add(4);
        a.add(9);
        a.add(-2);
        System.out.println(a);
        sortAndRemoveDuplicates(a);
        System.out.println(a);
    }

    public static void sortAndRemoveDuplicates(LinkedList<Integer> list) {
        TreeSet<Integer> holder = new TreeSet<>(list);

        while (!list.isEmpty()) {
            list.remove(0);
        }

        for (int n:holder) {
            list.add(n);
        }
    }
}
