import java.util.Scanner;
class ForTest04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Է�=");
		
		int max = scan.nextInt();

		int total=0, oddTotal=0, evenTotal=0;//��ü��, Ȧ����, ¦����
		for(int i=1; i<=max; i++){
			total += i;
			if(i%2==0){//¦��
				evenTotal +=i;
			}else{
				oddTotal +=i;
		}
	}
	//��� ���
	System.out.printf("1~%d������ ���� %d\n", max, total);
	System.out.printf("1~%d������ Ȧ���� ���� %d\n",max, oddTotal);
	System.out.printf("1~%d������ ¦���� ���� %d\n",max, evenTotal);
}
}

/*
����
�����Է�=100
1~100������ ���� 5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550
*/