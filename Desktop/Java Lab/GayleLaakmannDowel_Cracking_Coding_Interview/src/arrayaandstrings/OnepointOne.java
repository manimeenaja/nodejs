package arrayaandstrings;

public class OnepointOne {

	
	
	public boolean isUniqueChars(String str) {
		int checker =0;
		for (int i = 0; i<str.length();i++) {
			System.out.println(checker);
			int val = str.charAt(i) - 'a';
			System.out.println("Bitwise op"+ ((1 << val)&checker));
			if ((checker & (1 << val)) >0){
				return false;
			}
			checker |=(1<<val);
		}
		return true;
	}
	
	public static void main(String[] args ) {
		OnepointOne o = new OnepointOne();
		System.out.println(o.isUniqueChars("manimeenaja"));
	}
}
