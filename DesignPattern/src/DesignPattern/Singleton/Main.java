package DesignPattern.Singleton;

public class Main {
	public static void main(String[] args) {
		YongComputer yc = YongComputer.getInstance();
		
		System.out.println(yc.getCpu());
		System.out.println(yc.getGpu());
		System.out.println(yc.getRam());
		System.out.println(yc.getMouse());
		
		yc.setMouse("쥐원");
		
		YongComputer yc2 = YongComputer.getInstance();
		System.out.println(yc2.getMouse());
		
		System.out.println(yc2.hashCode());
		System.out.println(yc.hashCode());
	}
}
