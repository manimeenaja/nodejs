package arrayaandstrings;

public class SQRT {

	
	
	public static void main(String[] args) {
		int num = 10000;
		int guess = num;
		while(0.0001 < Math.abs(guess * guess - num)){
			guess = ((guess*guess + num) / guess)/2;
		}
		System.out.println(guess);
	}
}
