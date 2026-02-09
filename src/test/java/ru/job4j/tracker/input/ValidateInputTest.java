package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.tracker.output.*;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenCorrectInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"500"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(500);
    }

    @Test
    void whenCorrectSeveralInput() {
        Output output = new StubOutput();
        String[] testData = {"2", "3", "4", "500"};
        Input in = new MockInput(testData);
        ValidateInput input = new ValidateInput(output, in);
        for (String tmp : testData) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(Integer.parseInt(tmp));
        }
    }

    @Test
    void whenNegativeCorrectInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-400"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-400);
    }
}