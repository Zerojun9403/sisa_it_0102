package com.sisa;

public class OperatorTest2 {

	public static void main(String[] args) {

//     운년계산기
//		1. 연도를 4로 나누어 나머지가 0이고
//		   연도를 100 으로 나누어 나머지가 0이 아닌 경우.
//	    2. 연도를 400으로 나누어 나머지가 0인 경우.

		int year = 2026;

		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		System.out.println(isLeap);

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년이 아닙니다");
		}

	}

}
