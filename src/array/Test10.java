package array;

public class Test10 {
	
	public static void main(String[] args) {
		Test10 test10 = new Test10();
		test10.test();
	}
	public void test() {
//	[ 문제10 ] 다음과같은조건을만족하는프로그램을작성하시오
//	2차원배열에들어있는데이터들중3의배수만골라내서새로운1차원배열에기록하고출력한다.단중복값은하나만기록되게한다.
//	1. 사용데이터int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
//	int[]copyAr=newint[array의행갯수*열갯수];		
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		int[] copyAr = new int[4 * 4];
		System.out.print("copyAr : ");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
		        
				if(array[i][j] % 3 == 0)
				
				System.out.print(array[i][j] + " ");
				
				//중복 12제거가 안됨
			}
		}
		
	}

}
