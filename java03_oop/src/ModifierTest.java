import java03_oop.LottoOOP;
import java03_oop.DefaultData;
public class ModifierTest {

	public ModifierTest() {
		//LottoOOP lotto = new LottoOOP();
		//lotto.lottoStart();
	
		DefaultData dd = new DefaultData();
		//객체명,멤버변수
		//System.out.println("이름="+dd.name);
		System.out.println("이름="+dd.getName());
		//System.out.println("연락처="+dd.tel);
		
		DefaultData dd2 = new DefaultData("이순신", "010-8888-8888");
		dd2.sum();
		
		DefaultData.sum();
		//DefaultData.getName();
	}

	public static void main(String[] args) {
		//접근제한자
		// 클래스 : public, default(생략)
		// 생성자메소드, 메소드, 멤버변수 : public, protected,default,private
		new ModifierTest();
	
	}

}
