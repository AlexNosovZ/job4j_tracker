package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    void compareTest() {
        List<Item> items = Arrays.asList(new Item("bbbb"),
                new Item("dddd"),
                new Item("cccc"),
                new Item("aaaa")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(new Item("dddd"),
                new Item("cccc"),
                new Item("bbbb"),
                new Item("aaaa")
        );
        assertThat(items).containsExactlyElementsOf(expected);
    }
}