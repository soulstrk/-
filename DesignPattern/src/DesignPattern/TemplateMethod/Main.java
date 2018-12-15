package DesignPattern.TemplateMethod;

public class Main {
	public static void main(String[] args) {
		MasterPage mainPage = new MainPage();
		mainPage.defaultLayout();
		
		System.out.println("----------");
		
		MasterPage viewPage = new ViewPage();
		viewPage.defaultLayout();
	}
}
