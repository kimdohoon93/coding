import java.util.Scanner;
class ForTest10
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		for(;;){
	System.out.print("�޴�[1.�簢���� ����, 2.���� ����, 3.����]?");
		int menu = scan.nextInt();
		if(menu==1){
			System.out.print("����=");
				int w = scan.nextInt();
			System.out.print("����=");
				int h = scan.nextInt();
				int rect = w * h;
				System.out.println("�簢���� ����="+rect);
		}else if(menu==2){
			System.out.print("������=");
			int r = scan.nextInt();
			double circle = r * r * 3.145292;
			System.out.println("���� ����="+circle);
		}else if(menu==3){
			System.exit(0);
		}else{
			System.out.println("�޴��� �ٽ� �����ϼ���...");
		}
		
		}
}
}
