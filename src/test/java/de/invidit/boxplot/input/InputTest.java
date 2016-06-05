package de.invidit.boxplot.input;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class InputTest {
    @Test
    public void readNumbersTransformsInputToListOfIntegers() throws Exception {
        Input sut = new Input();
        Assertions.assertThat(sut.readNumbers(() -> "1,2,3")).containsExactly(1, 2, 3);
    }

    @Test
    public void readNumbersReturnsEmptyListBecauseOfNonIntegerInput() throws Exception {
        Input sut = new Input();
        Assertions.assertThat(sut.readNumbers(() -> "A,2,3")).isEmpty();
    }

}