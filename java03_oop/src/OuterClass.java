
public class OuterClass {
	int num = 100; // �������
	String name = "������";
	
	public OuterClass() {
		System.out.println("OuterClass������ �޼ҵ� �����");
	}
	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
		//�ܺ�Ŭ������ ����Ŭ������ ��������� ���ٺҰ��ϴ�
		//System.out.println("tel->"+tel);
	}
	
	public void createInner() {
		//Ŭ���������� ����Ŭ���� ��ü �����ϱ�
		InnerClass cc = new InnerClass();
		cc.tel = "010-9999-9999";
		cc.output();
		
	}
	
	//����Ŭ����
	class InnerClass{
		//�������
		String tel = "010-4444-2222";
		
		//�����ڸ޼ҵ�
		InnerClass(){
			System.out.println("InnerClass������ �޼ҵ� ����");
		}
		
		//�޼ҵ�
		public void output() {
			System.out.println("tel="+tel);
			//�ܺ�Ŭ������ ��������� ����Ŭ�������� ���� �����ϴ�.
			System.out.println("num=------->"+num);
			System.out.println("name------->="+name);
		}
	}

	public static void main(String[] args) {
		//OuterClass oc = new OuterClass();
		//oc.print();
		
		//���� Ŭ���� ��ü �����ϱ�
		//�ܺ�Ŭ���� ��ü ���� -> ����Ŭ���� ��ü����
		
		//1.
		InnerClass ic = new OuterClass().new InnerClass();
		ic.output();
		
		//2.
		OuterClass oc2 = new OuterClass();
		InnerClass ic2 = oc2.new InnerClass();
		ic2.output();
		
		oc2.createInner();
	}

}