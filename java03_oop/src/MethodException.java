
import java.util.Scanner;
public class MethodException {

	public MethodException() {
		start();
	}
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է�=");
		int n = Integer.parseInt(scan.nextLine());
		plus(150,n);
	}
	public void  plus(int i, int j) {
		int result = i+j;
		System.out.println(i+"+"+j+"="+result);
		devide(i, j);
	}
	public void  devide(int i, int j) {
		int result = i/j;
		System.out.println(i+"+"+j+"="+result);
	}
	public static void main(String[] args) {
		MethodException me = new MethodException();

	}

}
