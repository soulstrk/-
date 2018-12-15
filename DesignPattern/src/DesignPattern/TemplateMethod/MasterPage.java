package DesignPattern.TemplateMethod;

public abstract class MasterPage {
	
	public void defaultLayout() {
		//최상단 영역 생성
		System.out.println("기본 레이아웃 생성");
		
		//공통 헤더 영역 생성
		Header();
		
		//본문 영역 생성
		Content();
		
		//최하단 영역 생성
		System.out.println("최하단 영역 생성");
	}
	
	abstract void Content();
	
	void Header() {
		System.out.println("헤더 영역 생성");
	}
}
	