import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	private int integer = 0;
	public void setInput() {
		fizzBuzz.setInt(1);
		integer = fizzBuzz.getInt();
	}
	
	@Test
	void test() {
		setInput();
		assertEquals(1, integer);
		
	}

}
