package com.calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator test4 = new Calculator();
		test4.test();
	}
	public void test() {
// [ 문제4 ] 다음과같은조건을만족하는프로그램을작성하시오
// 1. 사용데이터 main의argument로1자리정수형(1부터9까지만) 값을2개입력받아4칙연산결과를출력한다. 입력값은모두 int 형으로처리한다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 > ");
		int num = sc.nextInt();	
		System.out.println("정수입력 > ");
		int num2 = sc.nextInt();
		
		if(num > 0 && num2 <= 9) {
//			int add = num + num2;
//			int min = num - num2;
//			int mul = num * num2;
//			int div = num / num2;
//			
			System.out.println("합 : " + (num + num2));
			System.out.println("차 : " + (num - num2));
			System.out.println("곱 : " + (num * num2));
			System.out.println("나누기 : " + (num / num2));
			
		}

	}

}
