package Empinfor;
import java.util.HashMap;

public class EmpDataSet {
	public static HashMap<String, EmpVO> empList = new HashMap<String,EmpVO>();
	public EmpDataSet() {
		
	}
	//�⺻������ ����
	public static void basicEmpSet() { 
		empList.put("ȫ�浿", new EmpVO("11111","ȫ�浿","010-1234-4567",5000,"2020-06-23"));
		empList.put("�氡�޽�", new EmpVO("22222","�氡�޽�","010-7895-8282",7000,"2015-05-09"));
		empList.put("���·�", new EmpVO("33333","���·�","010-7979-5252",6500,"2018-09-23"));
		empList.put("�庸��", new EmpVO("44444","�庸��","010-1212-6868",5500,"2019-08-23"));
		empList.put("������", new EmpVO("66666","������","010-2327-4807",6000,"2019-07-23"));
	}
	
	
}
