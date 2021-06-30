import java.util.Calendar;
import java.util.Scanner;
public class CalendarTest11 {
	Scanner scan = new Scanner(System.in);
	int year, month, date, week, lastDay; //  0
	
	CalendarTest11 () {}
		
		int getDate(String msg) {
//			Scanner scan = new Scanner(System.in);
			System.out.print(msg+"=");
			return this.scan.nextInt();
		}
		String setData() {
			year = (int)getDate("�⵵");
			month = (int)getDate("��");
			 
			System.out.printf("\t\t%d�� %d��\n",year,month);
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			return null;
		}
		void toDay() {
			Calendar date = Calendar.getInstance();
			date.set(year, month-1,1);//��¥ ���� 1��->0, 2��->,...5��->4

			week = date.get(Calendar.DAY_OF_WEEK);
		}
		void endDay () {
			lastDay = 31;
			switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					lastDay=30; break;
				case 2:
					//�⵵�� 4�� ���������� 100���� ���������� �ʤ����� ����
					//400���� ���������� ����
					if(year%4==0 &&	year%100!=0 ){
						lastDay = 29;
					}else{
						lastDay = 28; 
					}
			}
		}
			void toDayOut() {
				for(int s=1; s<week; s++){
					System.out.print("\t");
				}
				for(int d=1; d<=lastDay; d++){
					System.out.print(d+"\t");
					if((d+week-1)%7==0){
						System.out.println();
					}
				}
				System.out.println();
			}
		void startCalendar() {
			setData();
			toDay();
			endDay ();
			toDayOut();
		}
				
	
		public static void main(String a[]) {
			CalendarTest11 cal = new CalendarTest11();
			cal.startCalendar();
			}
		}
	
		


