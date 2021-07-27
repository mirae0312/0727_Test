package test.controller;

public class Test3 {
	
	public static void main(String[] args) {		
		Test3 test3 = new Test3();
		test3.test();
	}
	public void test() {
//	[ 문제3 ] 다음과같은조건을만족하는프로그램을작성하시오1부터100까지의모든정수들의합과평균을구하는프로그램을작성한다. 단, while문이나do while문을이용하여작성한다
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i++;
		}
		System.out.println("합계 : " + sum);
		System.out.print("평균 : " + (float)sum/100);
	}

}
