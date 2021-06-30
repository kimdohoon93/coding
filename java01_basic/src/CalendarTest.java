import java.util.Calendar;
class CalendarTest
{
	public static void main(String[] args) 
	{
		// ��ǻ���� ��¥ �ð� ���� ������
		// Calendar, Date

	Calendar now = Calendar.getInstance(); // getInstance() -> ��ü�� �������ִ� �޼ҵ�
    
	//��¥ ���� : set()
	now.set(2018, 06, 14); 

	//�⵵�� ����
    now.set(Calendar.YEAR, 2022);
	now.set(Calendar.MONTH, 10);
	
	// 2021�� 6�� 4�� (��) 15:21
    // get() --> ��¥, �ð� ���������� ���´�.
	int year = now.get(Calendar.YEAR); // 2021
	int month = now.get(Calendar.MONTH)+1; //6
	int day = now.get(Calendar.DAY_OF_MONTH); // 4
	int week = now.get(Calendar.DAY_OF_WEEK); // 6
	int hour = now.get(Calendar.HOUR_OF_DAY); // 16
	int minute = now.get(Calendar.MINUTE); //44

	String weekStr = "";
	switch(week){
		case 1 : weekStr = "��"; break;
		case 2 : weekStr = "��"; break;
		case 3 : weekStr = "ȭ"; break;
		case 4 : weekStr = "��"; break;
		case 5 : weekStr = "��"; break;
		case 6 : weekStr = "��"; break;
		case 7 : weekStr = "��"; break;
	}
	System.out.printf("%d�� %d�� %d�� (%s) %d:%d\n",year, month, day, week, hour, minute);

	
	System.out.println(now);

	//2020/10/14

	//�������� 
	int lastDay=now.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println("��������=>"+lastDay);
	int lastMonth = now.getActualMaximum(Calendar.MONTH);
	System.out.println("���߿� ����ū��=>"+lastMonth);
	int lastYear = now.getActualMaximum(Calendar.YEAR);
	System.out.println("�⵵�߿� ����ū��=>"+lastYear);
	}
}