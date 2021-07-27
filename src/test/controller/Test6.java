package test.controller;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 test6 = new Test6();
		test6.test();
	}
	public void test() {
//[ 문제6 ] 다음과같은조건을만족하는프로그램을작성하시오
// 키보드로1개의정수형(int)데이터를입력받아1부터5까지일때만해당숫자에해당하는결과를출력한다. 단, switch문을이용한다
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int i = sc.nextInt();
		String k = " ";
		switch(i) {
			case 1:
				k = "** 입력이 정상적으로 되었습니다! **";
				break;				
			case 2:
				k = "** 조회가 시작되었습니다! **";
				break;
			case 3:
				k = "** 수정이 정상적으로 되었습니다! **";
				break;
			case 4:
				k = "** 삭제가 정상적으로 되었습니다! **";
				break;
			case 5:
				k = "** 정상적으로 종료 되었습니다! **";
				break;
			default : System.out.println("** 다시 입력해주세요! **");
				return;
				
		}
		System.out.println(k);
	}

}
