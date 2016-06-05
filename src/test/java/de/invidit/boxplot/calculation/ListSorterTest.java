package de.invidit.boxplot.calculation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class ListSorterTest {
    @Test
    public void orderListWithNumbersFromLowToHigh() throws Exception {
        ListSorter<Integer> sut = new ListSorter<>();
        Assertions.assertThat(sut.orderList(Arrays.asList(2, 3, 1), (a, b) -> a -b)).containsExactly(1, 2, 3);
    }

}