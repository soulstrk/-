package DesignPattern.Strategy;

public class Gun implements Weapon{

	@Override
	public void attack() {
		System.out.println("탕탕");
	}

	@Override
	public void repair() {
		System.out.println("방아쇠 수리");
	}
	
}
