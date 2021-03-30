package org.vadim.azaza;

import java.util.*;

public class Task41 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Set.of(34, 2, 65, 7, 1));
        HashSet<Integer> set2 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 7, 6));
        HashSet<Integer> set3 = symmetricDifference(set1,set2);
        System.out.println(set3);
    }

    public static <T> HashSet<T> symmetricDifference(HashSet<? extends T> set1, HashSet<? extends T> set2) {

        ArrayList<T> array1 = new ArrayList<>(set1);
        ArrayList<T> array2 = new ArrayList<>(set2);

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if(array1.get(i).equals(array2.get(j))){
                    array1.remove(i);
                    array2.remove(j);
                    i--;
                    break;
                }
            }
        }

        array1.addAll(array2);

        return new HashSet<>(array1);
    }
}
