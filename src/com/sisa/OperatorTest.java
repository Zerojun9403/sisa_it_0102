package com.sisa;

public class OperatorTest {
	int v; // 맴버변수 (클래스에 정의되는 여러 메서드가 공유해서 사용)
	int v2 = 1004;

	public static void main(String[] args) { // 메인 메서드
		// TODO Auto-generated method stub
		int su1 = 10; // 지역변수
		int su2 = 10;
		System.out.println("su1 : " + su1++); // 후위연산자
		System.out.println("su1 : " + su1);

		System.out.println("su2 : " + ++su2); // 전위연산자
		
		System.out.println("su1 : " + su1--);
		System.out.println("su1 : " + su1);
		
		
		su1+=100;
		System.out.println("su1 : " + su1);
		
		su1-=5;
		System.out.println("su1 : " + su1);
		
		su1*=3;
		System.out.println("su1 : " + su1);
		
		su1/=10;
		System.out.println("su1 : " + su1);
		
		su1%=10;
		System.out.println("su1 : " + su1);
		
		
		

	}

}