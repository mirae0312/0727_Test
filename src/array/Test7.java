package array;

public class Test7 {
	
	public static void main(String[] args) {
		Test7 test7 = new Test7();
		test7.test();
	}
	public void test() {
//	[ 문제7 ] 다음과같은조건을만족하는프로그램을작성하시오
//	배열에들어있는데이터중홀수의값들을출력하고합을구한다. 단, continue를이용하여작성한다.   
//	1. 사용데이터int [] array= {1,2,3,4,5,6,7,8,9,10};
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		
		for(int i = 1; i < array.length + 1; i++) {
			if(i % 2 != 0) {
			System.out.println(i);	
			sum += i;
			}
		}
		System.out.println("합계 : " + sum);
		
	}

}
