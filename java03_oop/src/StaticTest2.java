
public class StaticTest2 {

		// static
		// ��������� �������� ���� public static int a=100
		// 					  static int b=200;
		//	 �޼ҵ��� ��ȯ�� ���ʿ� ǥ���Ѵ�.
		//			public static void method(){}
		//			static void method(){}
		
		//��������� ����ǥ�� �Ҽ�����.
		// static{}���� ���๮�� ǥ�� �Ҽ� �ִ�.
		// static{}�� �����ڸ޼ҵ�� static{}�� ���� ����ȴ�.
	static {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
		public StaticTest2() {
			System.out.println("StaticTest2()�޼ҵ� �����");
	}

		public static void main(String a[]) {
			new StaticTest2();
		}
}
