package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    void compareTest() {
        List<Item> items = Arrays.asList(new Item("bbbb"),
                new Item("dddd"),
                new Item("cccc"),
                new Item("aaaa")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(new Item("aaaa"),
                new Item("bbbb"),
                new Item("cccc"),
                new Item("dddd")
        );
        for (int i = 0; i < items.size(); i++) {
            assertThat(items.get(i).getName()).isEqualTo(expected.get(i).getName());
        }
    }
}