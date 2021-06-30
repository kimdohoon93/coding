import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


import Libraryinfor.BookDataSet;
import Libraryinfor.BookVO;
import Libraryinfor.LibraryDataSet;
import Libraryinfor.LibraryVO;

public class LibraryManager {
	Scanner scan = new Scanner(System.in);
	String menuTitle = "�޴�[1.ȸ�����, 2.ȸ�� �߰�, 3.ȸ�� ���� , 4.�뿩����å ���, 5.å�߰�, 6.����, 7.�α׾ƿ�, 8.����]";
	String bookTitle = "�޴�[1.�뿩������ å ���, 2.�˻�, 3.�ݳ�, 4.�뿩, 5.�α׾ƿ�]";
	
	public LibraryManager() {
	}
	public void start() {
		Scanner scan = new Scanner(System.in);
		String Wel = "[1.�α���, 2.�����ڷα���, 3.ȸ������]";
		System.out.println("=========================================");
		String come = inData(Wel);
		System.out.println("=========================================");
		LibraryDataSet.basicLmSet();
		String loginCheck = BookDataSet.getLoginCheck();
		if(come.equals("1")) {//ȸ��
			LibraryVO vo = new LibraryVO();
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� :");
			String libraryId = scan.nextLine();
			System.out.print("��й�ȣ :");
			String libraryPwd = scan.nextLine();
			String somePwd = "";
			
			int count = 0;
			
			Collection<LibraryVO> LibraryCollection = LibraryDataSet.libraryList.values();
			Iterator<LibraryVO> LibraryIterator = LibraryCollection.iterator();
			while(LibraryIterator.hasNext())  { // �α��� ���� ��ŭ �ݺ�
			
				LibraryVO idLogin = LibraryIterator.next();
				if(libraryId.equals(idLogin.getLibraryId())) { 
					somePwd = idLogin.getLibraryPwd();
						if(LibraryDataSet.libraryList.containsKey(libraryId)) {
							if(somePwd.equals(libraryPwd)) {
								System.out.println("�α��� �Ǿ����ϴ�.");

								
								if(loginCheck == null) {
									BookDataSet.basicBook();
									}
								BookDataSet.setLoginCheck("Y");
								BookDataSet.setLenderFirst(libraryId);
								bookProcessStart();
								break;
							}else{
								System.out.println("���̵�� ��й�ȣ�� ��ġ�����ʽ��ϴ�.");
								start();
								break;
							}
						}
					}else{
						count++;
						
					}
				}
			if(count ==  LibraryDataSet.libraryList.size() ) {
				System.out.println("��ϵ� ���̵� �����ϴ�.");
				start();
			}
		
  //------------------------------------------------------------------------ 

			
			
		}else if(come.equals("2")) {//������
			boolean logResult=false;
			do {
			//�α���
			String userid = inData("���̵�");
			String userpwd = inData("��й�ȣ");
			Login log = new Login();
			logResult = log.loginCheck(userid, userpwd);//
			}while(!logResult);
			System.out.println("�����ڸ��� �α��� �ϼ̽��ϴ�.");
			
			//�α��� �����ϸ� ���°�
			//����� �⺻���� ����
			if(loginCheck == null) {
				BookDataSet.basicBook();
				}
			BookDataSet.setLoginCheck("Y");
			LibraryDataSet.basicLmSet();
			
		
			LmProcessStart();
		
		
		}else if(come.equals("3")) {//ȸ������
			
			String id = inData("���̵�");
			String pwd = inData("��й�ȣ");
			String name = inData("�̸�");
			String number = inData("����ó");
			String dd = inData("�����");
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			LibraryDataSet.libraryList.put(id, new LibraryVO(id,pwd,name,number,dd));
			start();
			System.out.printf("%-10s %-10s %-10s %-15s %-10s\n",id,pwd,name,number,dd);
		}else {
		
		System.out.println("�޴��� �������ּ���");
		start();
		}
	
	}
	

	public void bookProcessStart() {
		do {
			//�޴��Է�
			System.out.println("============================================================");
			String menuu = inData(bookTitle);
			System.out.println("============================================================");
			if(menuu.equals("1")) {//�뿩������ å
				allBookList();
			}else if(menuu.equals("5")) {
				System.out.println("�α׾ƿ� �ϼ̽��ϴ�.");
				start();
				break;
			}else if(menuu.equals("2")) {//�˻�
				System.out.print("�˻��Ͻ� å ������ �Է����ּ���:");
				String findbooks = scan.nextLine();
				//String somebooks = "";
				
				
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
			
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(findbooks)) {	
						if(vb.getBookName().equals(findbooks)) {
						BookVO.bookPrint();
						vb.booPrint();
						break;
						}
					}else {
						System.out.println("�˻��Ͻ� å�� �����ϴ�.");
						
						break;
					}
				}
				
				
			
			}else if(menuu.equals("3")) {//�ݳ�
				System.out.print("�ݳ��Ͻ� å������ �Է����ּ��� :");
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
				String buybooks = scan.nextLine();
			
				
				
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(buybooks)) {	
						if(vb.getBookName().equals(buybooks)) {
							if(vb.getLenderCheck().equals("�뿩�Ұ�")) {
								if(BookDataSet.getLenderFirst().equals(vb.getLender())){
									vb.setLender("");
									vb.setLenderCheck("�뿩����");
									System.out.println("�ݳ��Ǿ����ϴ�.");	
									break;
								}else {
									System.out.println("�ݳ� �Ұ����� å�Դϴ�.");
									break;
								}
							}else {
								System.out.println("�ݳ� �Ұ����� å�Դϴ�.");
								break;
							}
						}
					}else {
						System.out.println("�˻��Ͻ� å�� �����ϴ�.");
						break;
					}
				}
		
			}else if(menuu.equals("4")) {//�뿩
				System.out.print("�뿩�Ͻ� å������ �Է����ּ��� :");
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
				String buybooks = scan.nextLine();
			
				
				
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(buybooks)) {	
						if(vb.getBookName().equals(buybooks)) {
							if(vb.getLenderCheck().equals("�뿩����")) {
								vb.setLender(BookDataSet.getLenderFirst());
								vb.setLenderCheck("�뿩�Ұ�");
								System.out.println("�뿩�Ǿ����ϴ�.");
								break;
							}else {
								System.out.println("�뿩�� �Ұ����� å�Դϴ�.");
								break;
							}
						}
					}else {
						System.out.println("�˻��Ͻ� å�� �����ϴ�.");
						break;
					}
				}
		
					}else {
				System.out.println("�޴��� �߸������Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
						}
					}while(true);
	}			

	
			
	//�޴�
	public void LmProcessStart() {
		do {
			//�޴��Է�
			System.out.println("============================================================================================");
			String menu = inData(menuTitle);
			System.out.println("============================================================================================");
			if(menu.equals("1")) {//ȸ�����
				allLibraryList();
			}else if(menu.equals("2")) {//ȸ�� �߰�
				 LibraryInsert();
				
			}else if(menu.equals("3")) {//ȸ�� ����
				libraryDelete();
				
			}else if(menu.equals("4")) {//�뿩����å���
				allBookList();
				//bookInsert();
			}else if(menu.equals("5")) {//å�߰�
				bookInsert();
				
			}else if(menu.equals("6")) {//å����
				bookDelete();
			}else if(menu.equals("7")) {//�α׾ƿ�
				System.out.println("�α׾ƿ� �ϼ̽��ϴ�.");
				start();
			}else if(menu.equals("8")) {//����
			
				System.err.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}else {
				System.out.println("�޴��� �߸������Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		}while(true);
	}
	
	//ȸ����ü��� ����ϱ�
	public void allLibraryList() {
		LibraryVO.titlePrint();
		Collection<LibraryVO> list = LibraryDataSet.libraryList.values();
		Iterator<LibraryVO> ii = list.iterator();
		while(ii.hasNext()) {
		LibraryVO vo = ii.next();
		vo.lmPrint();
		}
	}
	//�뿩����å ��� ����ϱ�
		public void allBookList() {
			BookVO.bookPrint();
			Collection<BookVO> list = BookDataSet.bookList.values();
			Iterator<BookVO> bb = list.iterator();
			while(bb.hasNext()) {
			BookVO vb = bb.next();
			if(vb.getLenderCheck().equals("�뿩����")) {
				vb.booPrint();
			}
		
		
		}
	}
			public void LibraryInsert() {
				//1���� ��������� ������ VO��ü �����ϱ�
				LibraryVO vo = new LibraryVO();
				vo.setLibraryId(inData("���̵�"));
				vo.setLibraryPwd(inData("��й�ȣ"));
				vo.setLibraryName(inData("ȸ���̸�"));
				vo.setTel(inData("����ó"));
				vo.setDate(inData("ȸ��������"));
				LibraryDataSet.libraryList.put(vo.getLibraryName(), vo);
			}
			//�������
			public void libraryDelete() {
				String delName = inData("������ ȸ����");
				LibraryDataSet.libraryList.remove(delName);
			}
			
			//å����
			public void bookDelete() {
				String delBook = inData("������ å");
				BookDataSet.bookList.remove(delBook);

			}//å �߰�
			public void bookInsert() {
			BookVO vo = new BookVO();
			
			vo.setBookName(inData("å �̸�"));//�����ȣ
			vo.setBookWriter(inData("å ����"));
			vo.setPrice(inData("å ����"));
			vo.setLenderCheck("�뿩����");
			vo.setLender("");
			
		
			BookDataSet.bookList.put(vo.getBookName(), vo);
			}
	

		private String inData(String menuTitle) {
			System.out.print(menuTitle+"->");
			return scan.nextLine();
	


	}

}
