/*
��ӡ���ε�* ��ϰһ��ѭ����Ƕ��
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
		//��ӡ������ 1 -- 7 ��
		for(int i = 1; i < 8; i++){
			//��ӡ' '�ҵ���ȷ��λ��
			for(int j = 7 - i; j > 0; j--){
				System.out.print('_');
			}
			//��ӡ��ȷ�������Ǻ�
			for(int k = 1; k <= i; k++){
				System.out.print("* ");
			}
			//����
			System.out.println();
		}
		//��ӡ������ 8 -- 13��
		for(int i = 1; i < 7; i++){
			//��ӡ' '�ҵ���ȷ��λ��
			for(int j = 1; j <= i; j++){
				System.out.print('_');
			}
			//��ӡ��ȷ�������Ǻ�
			for(int k = 7 - i; k > 0 ; k--){
				System.out.print("* ");
			}
			//����
			System.out.println();
		}
	}
}