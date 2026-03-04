package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        int total = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                total += subject.score();
                count++;
            }
        }
        return total / (double) count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int subjects = 0;
            int total = 0;
            for (Subject subject : pupil.subjects()) {
                subjects++;
                total += subject.score();
            }
            Label label = new Label(pupil.name(), (double) total / (double) subjects);
            result.add(label);
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> m = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                m.put(subject.name(), m.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> result = new ArrayList<>();
        for (String key : m.keySet()) {
            result.add(new Label(key, (double) m.get(key) / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int total = 0;
            for (Subject subject : pupil.subjects()) {
                total += subject.score();
            }
            Label label = new Label(pupil.name(), total);
            result.add(label);
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> m = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                m.put(subject.name(), m.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> result = new ArrayList<>();
        for (String key : m.keySet()) {
            result.add(new Label(key, (double) m.get(key)));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}