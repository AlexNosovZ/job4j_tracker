package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.LinkedHashMap;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average().orElse(0);

    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
       return stream.map(pupil -> new Tuple(pupil.name(),
                pupil
                        .subjects()
                        .stream()
                        .flatMapToInt(subject -> IntStream.of(subject.score()))
                        .average().orElse(0))).toList();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors
                        .groupingBy(Subject::name,
                                LinkedHashMap::new,
                                Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupil -> new Tuple(pupil.name(),
                pupil
                        .subjects()
                        .stream()
                        .flatMapToInt(subject -> IntStream.of(subject.score()))
                        .sum())).max(Comparator.comparing(Tuple::score)).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors
                        .groupingBy(Subject::name,
                                LinkedHashMap::new,
                                Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparing(Tuple::score)).orElse(null);
    }
}