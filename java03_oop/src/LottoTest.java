import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		Scanner scan = new Scanner(System.in);
		
		do {
			//���Ӽ�
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			//�Է¹��� ���Ӽ� ��ŭ ���Ӹ����
			for(int game=1; game<=cnt; game++) {
				//����1�� ����� 
				int lotto[]=new int[7];//�ζǹ�ȣ+���ʽ��� ������ �����Ͽ� ������ �迭
				for(int i=0; i<lotto.length; i++) {// i=0
					lotto[i] = (int)(Math.random()*45) + 1;
					
					//�ߺ��˻�
					for(int c=0; c<i; c++) {// 
						if(lotto[i]==lotto[c]) {
							i--;
						}
					}
				}
				//����
				for(int i=0; i<lotto.length-2; i++) {// 0,1,2,3,4
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j] > lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
		}
				//���
				System.out.print(game+"����=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println("bonus="+lotto[6]);
			}
				
			System.out.print("����Ͻðڽ��ϱ�[1:��, 2:�ƴϿ�]?");
			int check = scan.nextInt();
			if(check==2)break;// �ݺ����ߴ�
		}
		while(true);
	}
}
	
		
		

