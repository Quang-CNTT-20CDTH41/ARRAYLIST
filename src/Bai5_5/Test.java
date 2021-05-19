package Bai5_5;
import java.util.*;
public class Test extends SV{
	private List<SV> list;
	public Test(List<SV> list, String ten, int tuoi) {
		super(ten, tuoi);
		this.list = list;
	}
	public void inAn() {
		System.out.println(list);
	}
	public void sxTuoiGiam() {
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
	public <T> void dsSVTuoi(int k) {
		for(int i=0; i<list.size(); i++) {
			if(list.indexOf(k) != 0) {
				System.out.println(list.get(i));
			}
		}
	}
	public void xoaSVTuoi(int k) {
		
	}
}
