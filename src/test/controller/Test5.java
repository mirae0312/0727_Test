package test.controller;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Test5 test5 = new Test5();
		test5.test();
	}

	public void test() {
//	[ 문제5 ] 다음과같은조건을만족하는프로그램을작성하시오.
//	키보드로2개의정수형데이터를입력받아,두수가모두1부터9까지의수일때만두수의곱이한자리수인지두자리수인지를출력한다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int i = sc.nextInt();
		System.out.println("정수 입력 > ");
		int j = sc.nextInt();
		while(i > 0 && j < 10) {
			int mul = i * j;
			if(mul < 10) {
				System.out.println("한자리 수 입니다.");
				break;
			}
			else {
				System.out.println("두자리 수 입니다.");
				break;
			}
			
		}
		System.out.println();
	}
}
