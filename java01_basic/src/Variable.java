class Variable //Ŭ������ �빮�ڷ� �����ϰ� �ռ��� �϶��� �� �ܾ��� ù��°���ڸ� �빮�ڷ� �Ѵ�.
               //256���ڱ��� �����ϴ�.
{
	public static void main(String[] args) 
	{
		//������ : �� �Ǵ� �����͸� �����ϴ� ����� ������.
		//   ���� 50��, ���� 80��, ���� 70��
		
		//�⺻������ �� : ������ -> byte(1byte), short(2byte), int(4byte), long(8byte)
		//         �Ǽ�  -> float(4byte), double(8byte)
		//         ��  -> boolean(1byte)
		//         ����  -> char(2byte)
		//         ���۷����� -> 
          
        //byte kor = 50;  // 1byte
        int kor2 = 50;  // 4byte    ������ ����� int���̴�.
	    int eng = 80;
		int math = 70;

        //���� ���� ��Ģ
		//      ù��°���ڴ� �ҹ��ڷ� �����ϰų�, _, $�� �����Ҽ� �ִ�.
		//      �ռ����϶��� �ι�° ���� �ܾ�� �빮�ڷ� �����Ѵ�.
		//      ��ɾ�(�����)�� ������ ����Ҽ� ����.
		//      name, _name, $name
		//      9name, *name, if(�����)....


		//���
		// ������ : +, -, *, /, %(������)

		int sum = kor2 + eng + math; //200
		//         ����, ���� = ����
		//         ����, �Ǽ� = �Ǽ�
		//         �Ǽ�, ���� = �Ǽ�
		//         �Ǽ�, �Ǽ� = �Ǽ�
		double ave= sum / 3.0; // �Ǽ��� �⺻ ������ Ÿ���� double   31.4

		System.out.println("���� = "+ sum);
		System.out.println("��� = "+ ave);
        
		boolean state = true;  // true, fales   (1byte)
		char lastName = 'ȫ';
		String firstName = "�浿";

        //����ȯ
		float data = (float)3562.3265;
		int data2 = (int)12.1;

		//ū ���������� �����͸� ���� ���������� ������ �����Ҷ��� ����ȯ�� �ϸ�ȴ�.
		//���� ���������� �����͸� ū ���������� ������ �����Ҷ��� ����ȯ ���� �ʾƵ� �ȴ�.
		double data3 = 1234567;

	}
}
