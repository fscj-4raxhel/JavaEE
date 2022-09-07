/*
遍历100以内所有质数的输出。

优化一：
*/

class PrimeTest{
	public static void main(String[] args){
	
		boolean isPrime = true;
		
		long start = System.currentTimeMillis();
		for(int i = 2; i < 101; i++){
			for(int j = 2; j < i; j++){
				if( i % j == 0){
					isPrime = false;
					break;//优化：只对本身非质数的自然数是有效的。
				}
			}
			if(isPrime){
				System.out.println(i);
			}
			isPrime = true; 
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time Elapsed: " + (end - start));
	}

}