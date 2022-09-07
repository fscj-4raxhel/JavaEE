/*
例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”

说明：如果switch-case多个case的执行语句相同，则可以考虑使用合并
*/
class SwitchCaseTest1{
	public static void main(String[] args){
		int score = 60;
		
		switch(score / 10){
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
		default:
			System.out.println("及格");
		}
	}
}