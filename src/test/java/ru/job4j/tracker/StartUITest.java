package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenAdd3Items() {
        String[] answers = {"Fix PC", "Fix Wifi", "Fix Coffee machine"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        for (int i = 0; i < answers.length; i++) {
            StartUI.createItem(input, tracker);
        }
        Item[] created = tracker.findAll();
        for (int i = 0; i < answers.length; i++) {
            Item expected = new Item(answers[i]);
            assertThat(created[i].getName()).isEqualTo(expected.getName());
        }
    }
}