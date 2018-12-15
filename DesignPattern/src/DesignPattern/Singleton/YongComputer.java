package DesignPattern.Singleton;

public class YongComputer {
	private static YongComputer yongComputer = new YongComputer();
	private String cpu = "i7-7700k";
	private String gpu = "지포스1070";
	private int ram;
	private String mouse;
	
	private YongComputer() {}
	
	public static YongComputer getInstance() {
		return yongComputer;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMouse() {
		if(mouse != null) {
			return mouse;
		}else {
			return "마우스 없음";
		}
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
}
