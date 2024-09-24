package ifsp.tc1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    @DisplayName("All lists are empty")
    void allListsAreEmpty() {
        App app = new App();
        int[] a = {1};
        int[] b = {};
        int[] expected = {};
        int[] result = app.intercalate(a, b);
        assertArrayEquals(expected, result);
    }
    @Test
    @DisplayName("Lists have size n")
    void listsHaveSizeN() {
        App app = new App();
        app.setN(3);
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        boolean result = app.listsHaveNLength(a, b);
        assertTrue(result);
    }

}