package day08.test;

public class IPTV extends ColorTV {
	
	String addr;

	public IPTV(int size) {
		super(size);
	}

	public IPTV(String addr, int size, int color) {
		super(size);
		this.addr = addr;
		this.color = color;
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + addr + " 주소의 ");
		super.printProperty();
	}
	

}
