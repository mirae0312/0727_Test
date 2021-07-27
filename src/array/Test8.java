package array;

public class Test8 {
	public static void main(String[] args) {
		Test8 test8 = new Test8();
		test8.test();
	}
	public void test() {
//	[ 문제8 ] 다음과같은조건을만족하는프로그램을작성하시오2차원배열에들어있는데이터들의합계와평균을구한다. 
//	1. 사용데이터int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		double sum = 0;
		double tum = 0;
		double avg = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				tum++;
			}
		}
		System.out.println("합계 : " + sum);
		avg = sum / tum;
		System.out.println("평균 : " + avg);
	}

}
