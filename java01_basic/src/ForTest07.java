class ForTest07
{
	public static void main(String[] args) 
	{
		//중첩 for문
		int a=0;
		for(int i=1; i<=5; i++){//1,2,3,4,5  -행
			
				for(int j=1; j<=5; j++){//1,2,3,4,5   -열
				System.out.print(++a +"\t");// "$"로 바꿀수도있다
			}
			System.out.println();//줄바꿈
		}

		//
		for(int i=1; i<=25; i++){//1,2,3,4,5....25
			System.out.print(i+"\t");
			if(i%5==0){
				System.out.println();
			}
	}
	/*
	1
	12
	123
	1234
	12345
	*/
	for(int i=1; i<=5; i++){
		for(int j=1; j<=i; j++){
			System.out.print(j+" ");
	}
	System.out.println();
	}
	/*
	12345
	1234
	123
	12
	1
	*/
		for(int i=5; i>0; i--){// 5,4,3,2,1
			for(int j=1; j<=i; j++){// 1,2,3,4,5    1,2,3,4
			System.out.print(j);
		}
		System.out.println();
	}
	/*

	         *
		    **
	       ***
	      ****
		 *****
	*/
	
	for(int i=1; i<=5; i++){//1,2,3,4,5
		//공백
		for(int s=1; s<=5-i; s++){//1,2,3,4
			System.out.print(" ");
		}
		//문자
		for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		//줄바꿈
		System.out.println();
	}
	
	/*

	*****
	 ****
	  ***
	   **
	    *

	*/
	for(int i=5; i>0; i--){ //5,4,3,2,1
		//공백
		for(int s=1; s<=5-i; s++){
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++){
			System.out.print("$");
	}
		System.out.println();
	}
	/*
	        *
		   ***
		  *****
		 *******
		*********
	   ***********
   
	*/
	for(int i=1; i<=11; i+=2){//1,3,5,7,9,11
		//공백
		for(int s=1; s<=((11-i)/2); s++){
			System.out.print(" ");
		
		}
		//문자출력
		for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		//줄바꿈
	
		System.out.println();
	}
	/*

	   ***********
	    *********
		 *******
		  *****
		   ***
		    *

   
	*/
	for(int i=11; i>=1; i-=2){
		//공백
		for(int s=1; s<=((1+i)/2); s++){
			System.out.print("*");
		
		}
		//문자출력
		for(int j=1; j<=i; j++){
			System.out.print(" ");

		}
		//줄바꿈
        System.out.println();
	}
	}
	}

/*
1   2   3   4   5
6   7   8   9   10
11  12  13  14  15
16  17  18  19  20
21  22  23  24  25
*/