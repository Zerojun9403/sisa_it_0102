package com.sisa;

public class MyMethod {
	// 변수 선언 (맴버변수)
	// 메서드 정의

	void gildong() { // gildong 메서드 정의, 구현

		// 1.변수 선언 (지역변수)
		// 2.변수 초기화
		// 3.메서드 호출 : 가장많이사용
		// 4.조건문 (if, switch)
		// 5.반복문 (for, while, do~while)

		System.out.println("1. 문앞으로 이동");
		System.out.println("2. 문열기");
		System.out.println("3. 되돌아오기");
		// return; //생략가능
	}

	String lime() {
		System.out.println("1. 자판기앞으로 이동");
		System.out.println("2. 동전투입;");
		System.out.println("3. 커피버튼클릭");
		// 4. 커피를 뽑아서 되돌아오기; return "4. 아메리카노" //생략불가
		return "4. 아메리카노"; // 생략불가
	}

	int coin() {
		System.out.println("1. 자판기앞으로 이동");
		System.out.println("2. 동전투입");
		System.out.println("3. 콜라버튼클릭");

		// 4. 콜라를 뽑아서 되돌아오기;
		return 500; // 생략불가
	}

}
