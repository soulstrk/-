package DesignPattern.Strategy;

public class Ex implements Weapon{

	@Override
	public void attack() {
		System.out.println("도끼질");
	}

	@Override
	public void repair() {
		System.out.println("날을 갈다");
	}
	
}
