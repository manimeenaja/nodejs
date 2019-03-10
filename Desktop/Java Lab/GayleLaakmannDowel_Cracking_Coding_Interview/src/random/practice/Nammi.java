package random.practice;

import java.util.HashMap;
import java.util.Map;

public class Nammi {
	public static void main(String  [] args) {
		String str = "The orange is the fruit of the citrus species Citrus x "
				+ "sinensis in the family Rutaceae. It is also called sweet orange, t"
				+ "o distinguish it from the related Citrus x aurantium, referred to as"
				+ " bitter orange. The sweet orange reproduces asexually (apomixis through"
				+ " nucellar embryony); varieties of sweet orange arise through mutations. "
				+ "The orange is a hybrid between pomelo (Citrus maxima) and mandarin (Citrus reticulata). "
				+ "It has genes that are ~25% pomelo and ~75% mandarin; however, it is not a simple backcrossed "
				+ "BC1 hybrid, but hybridized over multiple generations. The chloroplast genes, and therefore the "
				+ "maternal line, seem to be pomelo. The sweet orange has had its full genome sequenced. Earlier "
				+ "estimates of the percentage of pomelo genes varying from ~50% to 6% have been reported. "
				+ "Sweet oranges were mentioned in Chinese literature in 314 BC. As of 1987, orange trees were "
				+ "found to be the most cultivated fruit tree in the world. Orange trees are widely grown in "
				+ "tropical and subtropical climates for their sweet fruit. The fruit of the orange tree can be"
				+ " eaten fresh, or processed for its juice or fragrant rind. As of 2012, oranges accounted for "
				+ "approximately 70% of citrus production. In 2014, 70.9 million tonnes of oranges were grown worldwide,"
				+ " with Brazil producing 24% of the world total followed by China and India.";
		String [] array = str.split("ee");
		int length = 0;
		int maxIndex = 0;
		int count =0;
		Map<Integer, Integer> map =  new HashMap<Integer,Integer>();
		for (int i = 0; i <array.length;i++) {
			String substr = array[i];
		if (substr.length() > length) {
			length = substr.length();
			maxIndex = i;
		}
		String newStr = substr.replace("th", "");
		count = (substr.length() - newStr.length())/2;
		map.put(i, count);		
		}
		System.out.println("Length of Max segment is "+map.get(maxIndex) +" and maximum length segment = "+length);
}
}
