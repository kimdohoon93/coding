
public class ArrayEx04 {

	public static void main(String[] args) {
		int data[][] = new int[10][10];
		
		for(int row=0; row<data.length-1; row++) {//���ȣ 0~8
			for(int col=0; col<data[row].length-1; col++)  { //����ȣ 0~8
				data[row][col] = (row+1) * (col+1); //����
				data[row][9] += data[row][col]; //���� ��
				data[9][col] += data[row][col]; //���� ��
			}	
		}
		
		//���
		for(int d[] : data) {
			for(int r : d) {
				System.out.printf("%5d", r);
			}
			System.out.println();
		}
		
		}
	}




		

	

