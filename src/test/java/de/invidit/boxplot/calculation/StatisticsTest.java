package de.invidit.boxplot.calculation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class StatisticsTest {
    @Test
    public void calcMaximunReturnsCorrectValue() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcMaximum(Arrays.asList(1,2,3))).isEqualTo(3);
    }

    @Test
    public void calcMinimunReturnsCorrectValue() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcMinimum(Arrays.asList(1,2,3))).isEqualTo(1);
    }

    @Test
    public void calcMedianReturnsCorrectValueOnOddNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcMedian(Arrays.asList(1,2,3))).isEqualTo(2);
    }

    @Test
    public void calcMedianReturnsCorrectValueOnEvenNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcMedian(Arrays.asList(1,2,3,4))).isEqualTo(2.5);
    }

    @Test
    public void calcLowerQuartilReturnsCorrectValueOnOddNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcLowerQuartil(Arrays.asList(1,2,3))).isEqualTo(1);
    }

    @Test
    public void calcLowerQuartilReturnsCorrectValueOnEvenNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcLowerQuartil(Arrays.asList(1,2,3,4))).isEqualTo(1.5);
    }


    @Test
    public void calcUpperQuartilReturnsCorrectValueOnOddNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcUpperQuartil(Arrays.asList(1,2,3))).isEqualTo(3);
    }

    @Test
    public void calcUpperQuartilReturnsCorrectValueOnEvenNumberOfItemsInList() throws Exception {
        Statistics sut = new Statistics();
        Assertions.assertThat(sut.calcUpperQuartil(Arrays.asList(1,2,3,4))).isEqualTo(3.5);
    }
}