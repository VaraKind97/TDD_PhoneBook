import org.junit.jupiter.api.Assertions;
import ru.netology.PhoneBook;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @RepeatedTest(2)
    public void testAdd_result() {
        final String name = "TestName";
        final long number = 9999999999L;
        final int original = 1;
        final int result = PhoneBook.add(name, number);
        assertEquals(original, result);
    }

    @Test
    public void testFindByNumber() {
        final String original = "TestName";
        final long number = 9999999999L;
        PhoneBook.phoneBook.put("TestName", 9999999999L);
        final String result = PhoneBook.findByNumber(number);
        assertEquals(original, result);
    }

    @Test
    public void testFindByName() {
        final String name = "TestName";
        final long original = 9999999999L;
        final long result = PhoneBook.findByName(name);
        assertEquals(original, result);
    }
    @Test
    public void printAllNames() {
        PhoneBook.add("Anna",916732145);
        PhoneBook.add("Sasha", 916452321);
        List<String> expected = new ArrayList<>(Arrays.asList("Anna", "Sasha", "Katya"));
        List<String> result = PhoneBook.printAllNames();
        Assertions.assertEquals(expected, result);
}
}