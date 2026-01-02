package com.sisa;

public class MethodCallTest {

//	C:\sisa\java\workspace\day0102\bin>java com.sisa.MethodCallTest
//	오류: javafx.application.Application 클래스에서 기본 메소드가 com.sisa.MethodCallTest이(가) 아닙니다.
//	다음 형식으로 기본 메소드를 정의하십시오.
//	public static void main(String[] args)
	public static void main(String[] args) {
		//프로그램의 앤트리 포인트 
		// 미션 A 클래스의 hello() 호출하기 
	    // 호출 ===> 메서드명();
		// 먼저 해야할 것 => 객체생성을 해야함 !! 
		A test  = new A();
		
		test.hello();
		
		A a = new A();
		// A클래스 객체생성 
		// (클래스가 포험하고 있는 필드와 메서드들을 메모리에 할당하겠다!)
		//==> A클래스를 사용할 준비를 끌마쳤다. 
		//==> a변수는 메모리 참조변수로  A클래스를 표현하는 변수다. 
		//==> a.필드명 a.메서드명으로 사용
		//==> a.hello(); A클래스에 있는 hello()메서드를 호출
		a.hello();
		
	}
}
