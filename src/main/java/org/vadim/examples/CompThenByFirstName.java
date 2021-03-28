package org.vadim.examples;

import java.util.*;

public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}
