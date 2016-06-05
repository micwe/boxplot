package de.invidit.boxplot.calculation;

import java.util.List;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class ListTransformer<T> {
    public List<T> returnLowerHalf(List<T> listToCutInHalf) {
        return listToCutInHalf.subList(0, listToCutInHalf.size() / 2);
    }

    public List<T> returnUpperHalf(List<T> listToCutInHalf) {
        return listToCutInHalf.subList(((listToCutInHalf.size() + 2 - 1) / 2), listToCutInHalf.size());
    }
}
