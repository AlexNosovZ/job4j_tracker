package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] splitLeft = left.split("/");
        String[] splitRight = right.split("/");
        StringBuilder builderLeft = new StringBuilder();
        StringBuilder builderRight = new StringBuilder();
        for (int i = 1; i < splitLeft.length; i++) {
            builderLeft.append(splitLeft[i]);
        }
        for (int i = 1; i < splitRight.length; i++) {
            builderRight.append(splitRight[i]);
        }
        int result = splitRight[0].compareTo(splitLeft[0]);
        return result != 0 ? result : builderLeft.toString()
                .compareTo(builderRight.toString());
    }
}