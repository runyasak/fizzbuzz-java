import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzBuzzGetOneShouldReturnOneTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(1);
        Assertions.assertEquals("1", actual);
    }
}