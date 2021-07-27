package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
			test1.test();
	}
	public void test() {
//[ 문제1 ] 다음과같은조건을만족하는프로그램을작성하시오.키보드로1개의정수형(int)데이터를입력받아,1~100사이의값일때만2의배수인지아닌지를출력처리한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int i = sc.nextInt();
		
		
		if(i <= 0 && i <= 101) {
			System.out.print("1 ~ 100사이의 정수를 입력해주세요.");			
			return;
			//100이상이여도 작동이안됨
		}
			int num = i;
		while(num > 0) {
			if(i % 2 != 0) {
				System.out.print("2의 배수가 아닙니다.");
				break;
			}
			else {
				System.out.print("2의 배수 입니다.");
				return;
			}
			
		
		}	
		
	}	
}