import java.util.Scanner;
class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int i=0, gold=0, opt=1, fivea=0,tena=0,fiveb=0,tenb=0,fivec=0,tenc=0,fived=0,tend=0,fivef=0,tenf=0;
			
		 do
		 {
			 System.out.print("�ݾ��� �Է��ϼ���?");
			 gold = scan.nextInt();
			 fivea = gold/50000;
			 gold %= 50000;
			 tena = gold/10000;
			 gold %= 10000;
			 fiveb = gold/5000;
			 gold %=5000;
			 tenb = gold/1000;
			 gold %=1000;
			 fivec = gold/500;
			 gold %=500;
			 tenc = gold/100;
			 gold %=100;
			 fived = gold/50;
			 gold %=50;
			 tend = gold/10;
			 gold %=10;
			 fivef = gold/5;
			 gold %=5;
			 tenf = gold/1;
			 gold %=1;

			System.out.printf("50000��=%d��\n",fivea);
			System.out.printf("10000��=%d��\n",tena);
			System.out.printf("5000��=%d��\n",fiveb);
			System.out.printf("1000��=%d��\n",tenb);
			System.out.printf("500��=%d��\n",fivec);
			System.out.printf("100��=%d��\n",tenc);
			System.out.printf("50��=%d��\n",fived);
			System.out.printf("10��=%d��\n",tend);
			System.out.printf("5��=%d��\n",fivef);
			System.out.printf("1��=%d��\n",tenf);
			System.out.printf("�ٽ��Ͻðڽ��ϱ�?(1.��, 2.�ƴϿ�)");
			opt= scan.nextInt();
			 
			 

		 }
		 while (opt !=2);




		
	}
}
/*
50000,10000,5000,1000,500,100,50,10,5,1

����
�ݾ��� �Է��ϼ���?123300��
50000��=2��
10000��=2��
1000��=3��
100��=3��
�ٽ��Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?1
�ݾ��� �Է��ϼ���.?5435
5000��=1��
100��=4��
30��=3��
1��=5��
�ٽ��Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?

*/