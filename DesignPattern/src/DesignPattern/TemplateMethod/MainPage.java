package DesignPattern.TemplateMethod;

public class MainPage extends MasterPage{

	@Override
	void Content() {
		System.out.println("본문 - 메인 페이지 생성");
	}
	
}
