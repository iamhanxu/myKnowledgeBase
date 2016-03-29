package com.leo.algorithm.math;

public class Count_Primes_204 {

	/*
	 * I known solution, the time complexity is not good O(N* sqrt(N))
	 * 
	 * 
Description:

Count the number of prime numbers less than a non-negative number, n.

I use isPrime(num) to check if the number is prime, the O(squrt N)
	 * 
	 */
	
public int countPrimes(int n) {
        
        int counter =0;
        for(int i=2;i<n;i++){
            if(this.isPrime(i))
            counter++;
        }
        
        return counter;
    }
    
    
    private boolean isPrime(int num){
        
        for(int i=2; i<=(int)Math.sqrt(num)+1;i++){
            if (num!=i && num%i==0)
            return false;
        }
        return true;
    }
    
    
}
