package random.practice;

import java.util.HashMap;
import java.util.Map;

public class SumofTwo {
	
	public static int[] sumOfTwo(int[] array, int target) {
		Map <Integer,Integer> map = new HashMap<Integer, Integer>();
		int [] result = new int [2];
		int n=0;
		map.put(array[0],n );
		for (int i =1;i<array.length;i++) {
			int val = target - array[i];
			if (map.containsKey(val)) {
				result [0] = map.get(val);
				result [1] = i;
			}
			else {
				n++;
				map.put( array[i], i);
				
			}
		}
		return result;
	}
	public static void main(String [] args) {
		int [] arr = {2,7,11,15};
		int[] array = SumofTwo.sumOfTwo(arr,9);
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
