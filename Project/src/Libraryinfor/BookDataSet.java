package Libraryinfor;
import java.util.HashMap;

public class BookDataSet {
	
	private static String lenderFirst;
	private static String loginCheck;
	
	public static HashMap<String, BookVO> bookList = new HashMap<String,BookVO>();
	public BookDataSet() {
		
	}
	//�뿩����å ����
	public static void basicBook() {
		bookList.put("������ʹ���", new BookVO("������ʹ���","������","16000","","�뿩����"));
		bookList.put("���ε��", new BookVO("���ε��","�����","20000","","�뿩����"));
		bookList.put("����7", new BookVO("����7","������","15000","","�뿩����"));
		bookList.put("����̻�Ȱ", new BookVO("����̻�Ȱ","�����","12000","","�뿩����"));
		bookList.put("�����ѻ��", new BookVO("�����ѻ��","�輱��","13000","","�뿩����"));
	}
	
	public static String getLenderFirst() {
		return lenderFirst;
	}
	public static void setLenderFirst(String lenderFirst) {
		BookDataSet.lenderFirst = lenderFirst;
	}
	public static String getLoginCheck() {
		return loginCheck;
	}
	public static void setLoginCheck(String loginCheck) {
		BookDataSet.loginCheck = loginCheck;
	}
	
	
}
