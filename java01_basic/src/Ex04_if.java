import java.util.Scanner;
class Ex04_if 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        
		//1. �����Է�
		System.out.print("����=");
        int kor = scan. nextInt();
		System.out.print("����=");
		int eng = scan .nextInt();
		System.out.print("����=");
		int math = scan .nextInt();

		//���
		int total = kor + eng + math;
		double avg = total / 3.0;

		

        //String, char
		// "A"     'A'
		//String grade = "F";
	    char grade = 'F';
		if(avg>=90){//A����
			grade = 'A';
		}else if(avg >=80){
			grade = 'B';
		}else if(avg>=70){
			grade = 'C';
		}else if(avg>=60){
			grade = 'D';
		}

		//3.���
		System.out.printf("����=%d\n���=%.2f\n����=%c\n", total, avg, grade);

			

		
	}
}

/* 
  ����,����, ���������� �Է¹޾� ����, ���, ������ ���Ͽ� ����϶�.
  �������� ���� 0~100�� ������ ���̴�.
  ����� �Ǽ��� ���Ѵ�.
  ������  switch������ �ۼ��Ѵ�.
  ����
  90~100   A
  80~89    B
  70~79    C
  60~69    D
  0~59     F

  ����
  ����=80
  ����=80
  ����=80
  ========================
  ����=240
  ���=80.0
  ����=B
*/