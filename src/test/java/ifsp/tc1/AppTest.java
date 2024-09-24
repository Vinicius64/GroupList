package ifsp.tc1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    @DisplayName("All lists are empty")
    void allListsAreEmpty() {
        int[] a = {1};
        int[] b = {};
        int[] expected = {};
        int[] result = App.intercalate(a, b);
        assertArrayEquals(expected, result);
    }
}