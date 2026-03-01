package ru.job4j.collection;
import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("vasya@mail.ru", "Василий Петрович Иванов");
        map.put("semen@mail.ru", "Семен Васильевич Петров");
        for (String key : map.keySet()) {
            System.out.printf("key=%s value=%s%n", key, map.get(key));
        }
    }
}
