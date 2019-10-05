import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	
	@Test
	void test1() {
		fizzBuzz.setInput(1);
		assertEquals("1", fizzBuzz.getInput());
		
	}
	
	@Test
	void test2() {
		fizzBuzz.setInput(2);
		assertEquals("2", fizzBuzz.getInput());
	}

	@Test
	void test3() {
		fizzBuzz.setInput(3);
		assertEquals("Fizz", fizzBuzz.getInput());
	}
	
	@Test
	void test4() {
		fizzBuzz.setInput(4);
		assertEquals("4", fizzBuzz.getInput());
	}
	
	@Test
	void test5() {
		fizzBuzz.setInput(5);
		assertEquals("Buzz", fizzBuzz.getInput());
	}
	
	@Test
	void test6() {
		fizzBuzz.setInput(6);
		assertEquals("Fizz", fizzBuzz.getInput());
	}
	@Test
	void test7() {
		fizzBuzz.setInput(7);
		assertEquals("7", fizzBuzz.getInput());
	}
	@Test
	void test8() {
		fizzBuzz.setInput(8);
		assertEquals("8", fizzBuzz.getInput());
	}
	
	@Test
	void test9() {
		fizzBuzz.setInput(9);
		assertEquals("Fizz", fizzBuzz.getInput());
	}
	@Test
	void test10() {
		fizzBuzz.setInput(10);
		assertEquals("Buzz", fizzBuzz.getInput());
	}
	@Test
	void test11() {
		fizzBuzz.setInput(11);
		assertEquals("11", fizzBuzz.getInput());
	}
	@Test
	void test12() {
		fizzBuzz.setInput(12);
		assertEquals("Fizz", fizzBuzz.getInput());
	}
	@Test
	void test13() {
		fizzBuzz.setInput(13);
		assertEquals("13", fizzBuzz.getInput());
	}
	@Test
	void test14() {
		fizzBuzz.setInput(14);
		assertEquals("14", fizzBuzz.getInput());
	}
	@Test
	void test15() {
		fizzBuzz.setInput(15);
		assertEquals("FizzBuzz", fizzBuzz.getInput());
	}
	
}
