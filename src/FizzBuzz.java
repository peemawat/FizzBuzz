

public class FizzBuzz {
	private static int input = 0;
	public String getInput() {
		if((input%3 == 0 )&(input%5 == 0) ) {
			return "FizzBuzz";
		}else if(input%5 == 0) {
			return "Buzz";
		}else if(input%3 == 0) {
			return "Fizz";
		}else {
		return input+"";
		}
	}
		public static void setInput(int i) {
				input = i;
		}

}
