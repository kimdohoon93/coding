import java.util.Scanner;
class StandardWeight

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("����=");
        int age = scan. nextInt();
		System.out.print("����(1:����,2:����)=");
		int sex = scan .nextInt();
		System.out.print("Ű=");
		int key = scan.nextInt();
		System.out.print("����ü��=");
		int wei = scan.nextInt();
		
		
		int pp=0;  // ǥ��ü��


		if(age<=35){
			switch (sex)
			{
				case 1 : pp =(int) ((key - 100) * 0.90); break;
				case 2 : pp =(int) ((key - 100) * 0.85); break;
			}
		}else if(age>=36){
			switch (sex)
			{
				case 1 : pp =(int) ((key - 100) * 0.95); break;
				case 2 : pp =(int) ((key - 100) * 0.90); break;
			}
		}

		double ff = (double)wei/pp * 100.0; //ǥ��ü�� ����
        
		
		String text = "";
		if(ff>=85){
			text = "������";
		}else if(ff >= 95){
		 	text = "���ݸ�����";
		}else if(ff >=115){
			text = "ǥ����";
		}else if(ff>=125){
			text = "���� ����";
		}else if(ff>=126){
			text = "����";
		} 
		


		System.out.printf("����=%d \n" ,age);
		System.out.printf("����=%d \n" ,sex);
		System.out.printf("Ű=%d \n" ,key);
		System.out.printf("����ü��=%d \n" ,wei);
		System.out.printf("ǥ��ü��=%d \n" ,pp);
		System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�. \n",ff,text);
		
		
 
	}
}
	