package DesignPattern.TemplateMethod;

public class ViewPage extends MasterPage{

	@Override
	void Content() {
		System.out.println("본문 - 뷰페이지 생성");
	}

	@Override
	void Header() {
		//super.Header();
		System.out.println("헤더 영역 재생성(다시 override)");
	}
	
	
}
