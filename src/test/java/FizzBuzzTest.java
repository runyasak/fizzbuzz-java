import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzBuzzGetOneShouldReturnOneTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(1);
        Assertions.assertEquals("1", actual);
    }

    @Test
    void fizzBuzzGetTwoShouldReturnTwoTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(2);
        Assertions.assertEquals("2", actual);
    }

    @Test
    void fizzBuzzGetTwoShouldReturnFizzTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(3);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void fizzBuzzGetFiveShouldReturnBuzzTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(5);
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void fizzBuzzGetFifteenShouldReturnFizzBuzzTest() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(15);
        Assertions.assertEquals("FizzBuzz", actual);
    }
}