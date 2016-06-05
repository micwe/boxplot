package de.invidit.boxplot.calculation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class ListTransformerTest {
    @Test
    public void returnLowerHalfWithEvenNumberOfItemsInList() throws Exception {
        ListTransformer<Integer> sut = new ListTransformer();
        Assertions.assertThat(sut.returnLowerHalf(Arrays.asList(1, 2, 3, 4))).containsExactly(1, 2);
    }

    @Test
    public void returnLowerHalfWithOddNumberOfItemsInList() throws Exception {
        ListTransformer<Integer> sut = new ListTransformer();
        Assertions.assertThat(sut.returnLowerHalf(Arrays.asList(1, 2, 3))).containsExactly(1);
    }

    @Test
    public void returnUpperHalfWithEvenNumberOfItemsInList() throws Exception {
        ListTransformer<Integer> sut = new ListTransformer();
        Assertions.assertThat(sut.returnUpperHalf(Arrays.asList(1, 2, 3, 4))).containsExactly(3, 4);
    }

    @Test
    public void returnUpperHalfWithOddNumberOfItemsInList() throws Exception {
        ListTransformer<Integer> sut = new ListTransformer();
        Assertions.assertThat(sut.returnUpperHalf(Arrays.asList(1, 2, 3))).containsExactly(3);
    }
}