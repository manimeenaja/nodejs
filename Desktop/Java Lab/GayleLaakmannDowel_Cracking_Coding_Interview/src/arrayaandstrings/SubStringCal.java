package arrayaandstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubStringCal {

	/*public static long substringCalculator(String s) {
	    // Write your code here
	    HashMap<String,Integer> result=new HashMap<>();
	    long count=0;
	    for(int i =0; i< s.length(); i++){
	    	String s2 =s.substring(i);
	        for(int j=0; j<s2.length(); j++){
	        	String str = s2.substring(0,s2.length()-j);
	            if(!result.containsKey(str)){
	                result.put(str,1);
	                count++;
	            }
	            
	        }
	    }
	    return count;
	    }*/
	
	 public static long getSubStrings(String s,int number){
	        Set<String> set=new HashSet<String>();
	        for(int i=0;i<=s.length()-number;i++){
	            String s3=s.substring(i,i+number);
	            set.add(s3);
	        }
	        return set.size();
	    }
	    public static long substringCalculator(String str) {
	        long count=(int) str.chars().distinct().count();
	        if(str.length()>1){
	            for(int i=2;i<=str.length();i++){
	                count=count+getSubStrings(str,i);
	            }
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		//long blah =substringCalculator("kincenvizh");
		long blah =substringCalculator("kincenvizh");
		System.out.println(blah);
	}
}
