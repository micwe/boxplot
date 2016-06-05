package de.invidit.boxplot.calculation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class ListSorter<T> {
    public List<T> orderList(List<T> listToOrder, Comparator<T> comparator) {
        return listToOrder.stream().sorted(comparator).collect(Collectors.toList());
    }
}
