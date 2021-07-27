package array;

public class Test9 {
	
	public static void main(String[] args) {
		Test9 test9 = new Test9();
		test9.test();
	}
	public void test() {
//	[ 문제9 ] 다음과같은조건을만족하는프로그램을작성하시오2차원배열에들어있는데이터중가장큰값과가장작은값을구한다. 
//	1. 사용데이터int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 	
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int a = array[i][j];
				if(max < a) {
					max = a;
				}
				if(min > a){
					min = a;
				}
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
}
