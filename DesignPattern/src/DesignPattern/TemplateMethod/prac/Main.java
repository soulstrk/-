package DesignPattern.TemplateMethod.prac;

public class Main {
	public static void main(String[] args) {
		Template layout = new DefaultGameConnectHelper();
		
		layout.requestConnection("aaa");
		
		layout = new playGameConnect();
		
		layout.requestConnection("bbb");
	}
}
