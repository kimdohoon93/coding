
public class MethodTest2Main {

	public MethodTest2Main() {
		
	}

	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		
		String gugu = mt.gugudan(8);//메소드 호출
		System.out.println(gugu);
		
		//반환형이 없는 메소드 호출
		mt.powerStart();
		
		//
		mt.channelUp();
		mt.channelUp();
		mt.channelDown();
		// static없는 메소드는 반드시 객체를 만들어 메소드를 호출해야한다.
		mt.sum(20);
		// static이 메소드의 반환형 왼쪽에 있는 경우는 메소드를 객체 생성하지않고 호출할수있다.
		//클래스명.멧드명(매게변수)
		MethodTest2.sum(50);
	}

}
