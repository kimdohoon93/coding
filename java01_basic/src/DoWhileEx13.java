import java.util.Scanner;
class DoWhileEx13
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		do{
			//�ݾ�
			System.out.print("�ݾ��� �Է��ϼ���?");
			int money = scan.nextInt();////4525120

			//ȭ��
			int won=50000, divide=5;

			while(money>0){
				int cnt = money/won;//ȭ���� ����
				if(cnt>0){
					System.out.print(won+"��="+cnt);
					if(won>=1000){
						System.out.println("��");
					}else{
						System.out.println("��");
						
					
					}
					money = money - cnt*won;
				}
				won = won / divide;//���� ȭ�����
				//���� ȭ����� ������ �������� �ٲ����� �Ѵ�.
				if(divide==5){
					divide=2;
				}else{
					divide=5;
				
		    }
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?");
			int status = scan.nextInt();
			if(status==2)	
				break;
			}while(true);
			
			}
	}
}



