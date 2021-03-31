package org.vadim.azaza;

import java.util.*;

public class Task41 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(34, 2, 65, 8, 7, 1, 3462, 4, 6, 46);
        Set<Integer> set2 = Set.of(1, 2, 3, 4, 5, 7, 6);
        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        ArrayList<T> array1 = new ArrayList<>(set1);
        ArrayList<T> array2 = new ArrayList<>(set2);

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i).equals(array2.get(j))) {
                    array1.remove(i);
                    array2.remove(j);
                    i--;
                    break;
                }
            }
        }

        array1.addAll(array2);
        Set<T> setout = new TreeSet<>(array1);
        return setout;
    }
}
