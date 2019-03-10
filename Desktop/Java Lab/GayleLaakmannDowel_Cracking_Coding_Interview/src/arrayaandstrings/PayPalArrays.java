
package arrayaandstrings;

import java.util.*;

public class PayPalArrays {

	public static void treeMap() {
		int [] array = {1,2,3,4,9,6,7,5,8,10};
		int [] result = new int[array.length];
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		for (int i =0 ;i<array.length;i++) {
			map.put(array[i], i);
		}
		int index =0;
		for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
			result[index] = entry.getValue();
			index++;
		}
		int []f = Arrays.copyOfRange(result, array.length-3, array.length);
		 
		Arrays.sort(f);
		for (int i:f)
			System.out.println(array[i]);
	}
	
	public static void priorityQueue() {
		int [] array = {1,2,3,4,9,6,7,5,8,10};
		PriorityQueue< Integer> q = new PriorityQueue<>();
		for (int a: array) {
			q.add(a);
		}
		int len = q.size();
		for (int i=0;i<len-3;i++) {
			q.remove();
		}
		for (int i =0;i<array.length;i++) {
			if (q.contains(array[i]))
				System.out.println(array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//treeMap();
		priorityQueue();
		
	}

}
