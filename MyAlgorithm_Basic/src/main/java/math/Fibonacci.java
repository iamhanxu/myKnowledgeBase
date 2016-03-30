package math;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	
	public int getFibonacci(int n){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		return this.getValue(n, map);
	}
	
	
	private int getValue(int i, Map<Integer,Integer> map){
		
		
		if(i==1 || i==2){
			map.put(i, 1);
			return 1;
		}
	
		int vi1 =0;
		int vi2 =0;
		
		if(map.containsKey(i-1)){
			vi1 = map.get(i-1);
		}else{
			vi1= this.getValue(i-1, map);
			map.put(i-1, vi1);
		}
		
		if(map.containsKey(i-2)){
			vi2 = map.get(i-2);
		}else{
			vi2 =this.getValue(i-2, map);
			map.put(i-2, vi2);
		}
		
		map.put(i, vi1+vi2);
		
		return vi1+vi2;
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Fibonacci f = new Fibonacci();
		int result = f.getFibonacci(10);

		System.out.println(result);
	}

}
