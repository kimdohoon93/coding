package java05_Class;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest2 {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest2() {}
	public void start() {
	do {
		try{
		//�μ��� �Է¹޾� ��Ģ�����Ͽ� ����϶�.
		System.out.print("ù��° ��=");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ��=");
		int n2 = Integer.parseInt(scan.nextLine());
		
		int plus = n1+n2;
		int minus = n1-n2;
		int mul = n1*n2;
		int devide = n1/n1;
		
		System.out.println(n1+"+"+n2+"="+plus);
		System.out.println(n1+"-"+n2+"="+minus);
		System.out.println(n1+"*"+n2+"="+mul);
		System.out.println(n1+"/"+n2+"="+devide);
		
		String names[] = {"ȫ�浿","��浿"};
		for(int i=0; i<=names.length; i++) {
			System.out.println("name["+i+"]="+names[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException aioo) {
			System.out.println("�迭�� ÷�ڰ� �����Դϴ�.");
		}catch(Exception e) {//NumberException, ArithmeticException
			System.out.println("Exception-->"+e.getMessage());
		}

		
		
	}while(true);{
		//System.out.println("���α׷� ����");
	
	}
	public static void main(String[] args) {
		ExceptionTest2 et = new ExceptionTest2();
		et.start();
		}
	}
}

/*
 	����:�ϵ���� ����ó�� ���α׷����� �����Ҽ� ���� ������ ���Ѵ�.
 	����ó�� : ���α׷����� �����Ҽ� �ִ� ������ Exception�̶���Ѵ�.
 	
 	//1.���
 	try{
 		���๮;
 		���ܹ߻��� ���ɼ��� �ִ� ��ɾ� �Ǵ� ���ܹ߻��� ���ɼ��� ���� ��ɾ ��� ǥ���Ҽ��ִ�.
 	}catch(��������){
 		���ܰ� �߻��ϸ� ������ ���๮
 	}catch(��������){
 		���ܰ� �߻��ϸ� ������ ���๮
 	}
 	:
 	:
 	finally{
 		���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ���๮;
 		���������ϴ�.
 
 
 */
