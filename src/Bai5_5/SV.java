package Bai5_5;

public class SV {
	protected String ten;
	protected int tuoi;
	public SV(String ten, int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public void inSV() {
		System.out.println("Ten: " + ten  + "\nTuoi: "+ tuoi);
	}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
}
