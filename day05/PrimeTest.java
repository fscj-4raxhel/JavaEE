/*
����100�������������������

�Ż�һ��
*/

class PrimeTest{
	public static void main(String[] args){
	
		boolean isPrime = true;
		
		long start = System.currentTimeMillis();
		for(int i = 2; i < 101; i++){
			for(int j = 2; j < i; j++){
				if( i % j == 0){
					isPrime = false;
					break;//�Ż���ֻ�Ա������������Ȼ������Ч�ġ�
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