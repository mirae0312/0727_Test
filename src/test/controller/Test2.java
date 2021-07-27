package test.controller;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
			test2.test();
	}
	public void test(){
//	[문제2] 다음과같은조건을만족하는프로그램을작성하시오.2단에서5단까지의구구단의결과중홀수인것만출력한다. 단, for문을이용한다.
		for(int i = 2; i < 6; i++) {
			System.out.println("-----"+ i + "단-----");
			 for(int j = 1; j < 10; j++) {
				 if((i * j) % 3 == 0 ) {				 
					 System.out.printf("%d * %d = %d%n", i, j, i*j);
				 }
			 }

		}
	}

}
