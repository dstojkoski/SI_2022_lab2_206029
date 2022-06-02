import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
        RuntimeException ex;

        // Test case 1
        List<String> emptyList = createList();
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(emptyList));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        // Test case 2 -> List = {#, 0, #}
        List<String> invalidList = createList("#", "0", "#");
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(invalidList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        // Test case 3 -> List = {0, 0, #,
        //                        #, 0, #,
        //                        0, #, 0}
        List<String> validList = createList("0", "0" , "#", "#", "0", "#", "0", "#", "0");
        assertEquals(createList("1", "1", "#", "#", "3", "#", "2", "#", "2"), SILab2.function(validList));
    }

    @Test
    void everyBranchTest(){
        RuntimeException ex;

        // Test case 1
        List<String> emptyList = createList();
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(emptyList));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        // Test case 2 -> List = {#, 0, #}
        List<String> invalidList = createList("#", "0", "#");
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(invalidList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        // Test case 3 -> List = {0, 0, #,
        //                        #, 0, #,
        //                        0, #, 0}
        List<String> validList = createList("0", "0" , "#", "#", "0", "#", "0", "#", "0");
        assertEquals(createList("1", "1", "#", "#", "3", "#", "2", "#", "2"), SILab2.function(validList));
    }
}