import java.util.Scanner;
class IfTestIf 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        
		/*
		    �޿��� �Է¹ٴ� �޿��� 10000~20000�̸� ���ʽ� 20%����
			                  20000~30000�̸�      15%
							  30000~40000�̸�      10%
							  40000~50000         5%
							  �׿�                 0
		*/
		//1. �޿��Է�
		      System.out.print("�޿��� �Է��ϼ���?-->");
			  int sal = scan.nextInt();

              int bouns = 0;
			  if(sal>=10000 && sal<=20000){
				  bouns = (int)(sal * 0.2);
			  }else if(sal>=20000 && sal<=30000){
				  bouns = (int)(sal % 0.15);
			  }else if(sal>=30000 && sal<=40000){
				  bouns = (int)(sal % 0.1);
			  }else if(sal>=40000 && sal<=50000){
				  bouns = (int)(sal *0.05);
			  }
			  System.out.printf("�޿���=%d, ���ʽ�=%d\n", sal, bouns);
			  
			  
	}
}

/*
     if~elseif ��

	 if(���ǽ�){
		 ���๮;
		 ���๮;
     }elseif(���ǽ�){
		 ���๮;
		 ���๮;
     }elseif(){
		 ���๮;
		 ���๮;
		 }else{
			 ���๮;
			 }
			 */