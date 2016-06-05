package de.invidit.boxplot.calculation;

import java.util.List;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class Statistics {
    public int calcMaximum(List<Integer> sortedList) {
        return sortedList.get(sortedList.size() - 1);
    }

    public int calcMinimum(List<Integer> sortedList) {
        return sortedList.get(0);
    }

    public double calcMedian(List<Integer> sortedList) {
        double result;

        if (sortedList.size() % 2 == 0) {
            result = (double) (sortedList.get((sortedList.size() / 2) - 1) + sortedList.get(sortedList.size() / 2)) / 2;
        } else {
            result = sortedList.get((sortedList.size() - 1) / 2);
        }

        return result;
    }

    // First attempt, but now mixed up integration and operation...is hybrid ok?
    public double calcLowerQuartil(List<Integer> sortedList) {
        return calcMedian(sortedList.subList(0, sortedList.size() / 2));
    }

    // First attempt, but now mixed up integration and operation...is hybrid ok?
    public double calcUpperQuartil(List<Integer> sortedList) {
        return calcMedian(sortedList.subList(((sortedList.size() + 2 - 1) / 2), sortedList.size()));
    }

}
