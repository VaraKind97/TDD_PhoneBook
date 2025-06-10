import org.junit.jupiter.api.RepeatedTest;
import ru.netology.PhoneBook;
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
}