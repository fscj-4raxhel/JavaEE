/*
打印菱形的* 练习一下循环的嵌套
Like
______*
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
	  
*/

class DiamondTest{
	public static void main(String[] args){
		//打印上三角 1 -- 7 行
		for(int i = 1; i < 8; i++){
			//打印' '找到正确的位置
			for(int j = 7 - i; j > 0; j--){
				System.out.print('_');
			}
			//打印正确个数的星号
			for(int k = 1; k <= i; k++){
				System.out.print("* ");
			}
			//换行
			System.out.println();
		}
		//打印下三角 8 -- 13行
		for(int i = 1; i < 7; i++){
			//打印' '找到正确的位置
			for(int j = 1; j <= i; j++){
				System.out.print('_');
			}
			//打印正确个数的星号
			for(int k = 7 - i; k > 0 ; k--){
				System.out.print("* ");
			}
			//换行
			System.out.println();
		}
	}
}