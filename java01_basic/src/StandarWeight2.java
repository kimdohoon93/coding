import java.util.Scanner;
class StandarWeight2

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("����=");
		int age =scan.nextInt();
		System.out.print("����(1.����, 2.����=");
		int gender = scan.nextInt();
		System.out.print("Ű=");
		double height = scan.nextDouble();
		System.out.print("����ü��=");
		double weight = scan.nextDouble();

		double idx = 0.90;
		if(age<=35 && gender==2)
			idx = 0.85;
		else if(age>=36 && gender==1);
			idx = 0.95;

		//ǥ��ü��
		double sWeight = (height-100)*idx;
		//ǥ��ü������
		double sWeightIndex = (weight/sWeight)*100;
		//ǥ��ü������ �򰡱���
		String sWeightMsg = "";
		if(sWeightIndex<=85) sWeightMsg = "������";
		else if (sWeightIndex<=95) sWeightMsg = "���� ������";
		else if (sWeightIndex<=115) sWeightMsg = "ǥ����";
		else if (sWeightIndex<=125) sWeightMsg = "���� ����";
		else sWeightMsg = "����";
		}
		System.out.printf("ǥ��ü��=%2f\n");
	    System.out.printf("����� ǥ��ü�������� %2f���� %s�Դϴ�.\n");
		}

}
	
