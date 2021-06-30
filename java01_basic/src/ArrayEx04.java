
public class ArrayEx04 {

	public static void main(String[] args) {
		int data[][] = new int[10][10];
		
		for(int row=0; row<data.length-1; row++) {//행번호 0~8
			for(int col=0; col<data[row].length-1; col++)  { //열번호 0~8
				data[row][col] = (row+1) * (col+1); //숫자
				data[row][9] += data[row][col]; //행의 합
				data[9][col] += data[row][col]; //열의 합
			}	
		}
		
		//출력
		for(int d[] : data) {
			for(int r : d) {
				System.out.printf("%5d", r);
			}
			System.out.println();
		}
		
		}
	}




		

	

