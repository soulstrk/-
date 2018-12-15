package DesignPattern.Strategy;

public class Main {
	public static void main(String[] args) {
		Charactor charactor = new Charactor("전사");
		charactor.setWeapon(new Ex());
		charactor.getWeapon().attack();
		
		charactor.getWeapon().repair();
		charactor.setWeapon(new Gun());
		charactor.getWeapon().attack();
	}
}
