import java03_oop.LottoOOP;
import java03_oop.DefaultData;
public class ModifierTest {

	public ModifierTest() {
		//LottoOOP lotto = new LottoOOP();
		//lotto.lottoStart();
	
		DefaultData dd = new DefaultData();
		//��ü��,�������
		//System.out.println("�̸�="+dd.name);
		System.out.println("�̸�="+dd.getName());
		//System.out.println("����ó="+dd.tel);
		
		DefaultData dd2 = new DefaultData("�̼���", "010-8888-8888");
		dd2.sum();
		
		DefaultData.sum();
		//DefaultData.getName();
	}

	public static void main(String[] args) {
		//����������
		// Ŭ���� : public, default(����)
		// �����ڸ޼ҵ�, �޼ҵ�, ������� : public, protected,default,private
		new ModifierTest();
	
	}

}
