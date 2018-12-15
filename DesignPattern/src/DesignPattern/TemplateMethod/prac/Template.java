package DesignPattern.TemplateMethod.prac;

public abstract class Template {
	
	public String requestConnection(String encodedInfo) {
		//보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaaa";
		String pwd = "bbbb";
		
		if(!authentication(id,pwd)) {
			throw new Error("아이다 암호 불일치");
		}
		
		authorization(id);
		
		connection(decodedInfo);
		
		return null;
	}
	
	protected abstract String doSecurity(String str);
	
	protected abstract boolean authentication(String id, String pwd);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
}
