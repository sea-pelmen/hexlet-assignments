package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {

        // BEGIN
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        numbers2.add(3);
        numbers2.add(10);

        List<Integer> result1 = App.take(numbers1, 2);
        assertThat(result1).isEqualTo(Arrays.asList(1, 2));

        List<Integer> result2 = App.take(numbers2, 8);
        assertThat(result2).isEqualTo(Arrays.asList(7, 3, 10));

        // END
    }
}
