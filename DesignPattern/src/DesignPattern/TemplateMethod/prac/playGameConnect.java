package DesignPattern.TemplateMethod.prac;

public class playGameConnect extends Template{

	@Override
	protected String doSecurity(String str) {
		System.out.println("아이디 확인 과정");
		return str;
	}

	@Override
	protected boolean authentication(String id, String pwd) {
		System.out.println("아이디확인");
		return false;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("커넥션");
		return info;
	}
	
}

