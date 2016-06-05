package de.invidit.boxplot.output;

import java.util.function.Consumer;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class Reporter {
    public void report(String output, Consumer<String> reportTo) {
        reportTo.accept(output);
    }
}
