package de.invidit.boxplot.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class Input {
    public List<Integer> readNumbers(Supplier<String> readFrom) {
        List<Integer> result;
        try {
            result = Arrays.asList(readFrom.get().split(","))
                    .stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            result = new ArrayList<>();
        }
        return result;
    }
}
