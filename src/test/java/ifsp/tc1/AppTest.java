package ifsp.tc1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    @DisplayName("All lists are empty")
    void allListsAreEmpty() {
        App app = new App();
        int[] a = {};
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
    @Test
    @DisplayName("Generated list have size 2n")
    void generatedListHaveSize2N() {
        App app = new App();
        app.setN(3);
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int expected = 6;
        int[] result = app.intercalate(a, b);
        assertEquals(expected, result.length);
    }

    @Test
    @DisplayName("Generated list is correct")
    void generatedListIsCorrect() {
        App app = new App();
        app.setN(3);
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] expected = {1, 4, 2, 5, 3, 6};
        int[] result = app.intercalate(a, b);
        assertArrayEquals(expected, result);
    }
}