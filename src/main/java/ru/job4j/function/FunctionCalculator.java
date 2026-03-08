package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        Supplier<List<Double>> supplier = () -> new ArrayList<>();
        List<Double> result = supplier.get();
        for (int i = start; i < end; i++) {
            result.add(function.apply((double) i));
        }
        return result;
    }
}