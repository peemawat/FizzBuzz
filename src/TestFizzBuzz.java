import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	void test1() {
		fizzBuzz.setInput();
		assertEquals("1", fizzBuzz.getInput());
		
	}
	@Test
	void test2() {
		fizzBuzz.setInput();
		assertEquals("2", fizzBuzz.getInput());
	}

	@Test
	void test3() {
		fizzBuzz.setInput();
		assertEquals("Fizz", fizzBuzz.getInput());
	}

}
