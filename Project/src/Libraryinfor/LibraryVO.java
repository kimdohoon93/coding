package Libraryinfor;

public class LibraryVO {
	private String libraryId; //������ ���̵�
	private String libraryPwd; //������ ��й�ȣ
	private String libraryName; //������ ȸ����
	private String tel; //����ó
	private String date; //���Գ�¥

	public LibraryVO() {
	}
	public LibraryVO(String libraryId,String libraryPwd, String libraryName,String tel,String date) {
		this.libraryId = libraryId;
		this.libraryPwd = libraryPwd;
		this.libraryName = libraryName;
		this.tel = tel;
		this.date = date;

	}
	
		public void lmPrint() {
			System.out.printf("%-10s %-10s %-10s %-15s %-10s\n",libraryId,libraryPwd,libraryName,tel,date);
		}
		//Ÿ��Ʋ ���
		public static void titlePrint() {
			System.out.printf("%-8s %-8s %-13s %-13s %-10s\n","���̵�","��й�ȣ","ȸ���̸�","����ó","���Գ�¥");
	}
	
		public String getLibraryId() {
			return libraryId;
		}
		public void setLibraryId(String libraryId) {
			this.libraryId = libraryId;
		}
		public String getLibraryPwd() {
			return libraryPwd;
		}
		public void setLibraryPwd(String libraryPwd) {
			this.libraryPwd = libraryPwd;
		}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
	
