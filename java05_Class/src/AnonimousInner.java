
public class AnonimousInner {

	public AnonimousInner() {
		
	}
	public void innerTest() {
		//�͸��� ���� Ŭ���� : Ŭ�������� �������� �ʴ´�.
		//				   �ٸ� Ŭ������ ��üȭ�ϴ� �������� Ŭ���� �����Ͽ� ���θ����.
	
		new Student() {
			//�����
			String tel = "010-1234-8888";
			//StudentŬ������ print�޼Ҹ��� �������̵�
			public void print() {
				System.out.println("num="+num);
				System.out.println("name="+name);
				System.out.println("tel="+tel);
			}
		
		}.print();
		
	}
	

	public static void main(String[] args) {
		new AnonimousInner().innerTest();

	}

}
