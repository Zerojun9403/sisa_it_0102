package com.sisa;

public class ConditionTest {
	/*
	 * ConditionTest.java (소스코드, 텍스트파일)
	 * 
	 * == 컴파일 ==>javac (이클립스의 경우 저장을 할때 컴파일 발생)
	 * 
	 * ==> ConditionTest.class(실행코드, 바이트코드 파일)
	 * 
	 * == 인터프린터 ==> java ConditionTest.class (해당클래스 main()메서드를 호출) Ctrl+F11(인터프린터호출)
	 */
	public static void main(String[] args) {
		boolean condition = false;
		if(condition) 
		System.out.println("열심히 공부합시다.");
		// condition 즉, 조건식의 결과가 참일때 실행할 문장이 단 1개이면 영역 괄호{ }를 생락
		// 2개 이상이면 반드시 영역괄호{ } 명시해야함.
		
		System.out.println("오늘도 수고했어!!!!");

	}

}
