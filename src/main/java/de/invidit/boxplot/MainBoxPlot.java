package de.invidit.boxplot;

import de.invidit.boxplot.calculation.ListSorter;
import de.invidit.boxplot.calculation.ListTransformer;
import de.invidit.boxplot.calculation.Statistics;
import de.invidit.boxplot.input.Input;
import de.invidit.boxplot.output.Reporter;

import java.util.List;
import java.util.Scanner;

/**
 * @author Michael Weber
 * @since 05.06.2016
 */
public class MainBoxPlot {
    public static void main(String...args) {
        Statistics statistics = new Statistics();
        ListTransformer<Integer> listTransformer = new ListTransformer<>();
        Reporter reporter = new Reporter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give list of numbers separated by comma, e.g. 1,2,3,4: ");
        List<Integer> unsortedList = new Input().readNumbers(scanner::nextLine);
        List<Integer> sortedList = new ListSorter<Integer>().orderList(unsortedList, (a, b) -> a - b); // Integration or operation?

        reporter.report("Maximum: " + statistics.calcMaximum(sortedList), System.out::println);
        reporter.report("Minimum: " + statistics.calcMinimum(sortedList), System.out::println);
        reporter.report("Median: " + statistics.calcMedian(sortedList), System.out::println);
        reporter.report("lower Quartil: " + statistics.calcMedian(listTransformer.returnLowerHalf(sortedList)), System.out::println);
        reporter.report("upper Quartil: " + statistics.calcMedian(listTransformer.returnUpperHalf(sortedList)), System.out::println);
    }
}
